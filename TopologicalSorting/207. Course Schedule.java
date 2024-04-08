import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        boolean[] visited = new boolean[numCourses]; // Tracks if a node has been visited
        boolean[] onStack = new boolean[numCourses]; // Tracks nodes on the recursion stack

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, graph, visited, onStack)) {
                    return false; // Cycle detected
                }
            }
        }
        return true; // No cycle detected
    }

    private boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, boolean[] onStack) {
        if (visited[node]) return false; // Already visited, no cycle from this node
        visited[node] = true;
        onStack[node] = true; // Add node to stack

        for (Integer neighbor : graph.get(node)) {
            if (!visited[neighbor] && dfs(neighbor, graph, visited, onStack)) {
                return true; // Cycle detected in a neighbor
            } else if (onStack[neighbor]) {
                // If the neighbor is already on the stack, we've detected a cycle
                return true;
            }
        }
        onStack[node] = false; // Remove node from stack
        return false; // No cycle detected from this node
    }
}
