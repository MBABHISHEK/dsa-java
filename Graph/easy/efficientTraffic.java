boolean solution(int n, int[][] roads) {

 List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }

        // Populate the adjacency lists
        for (int[] road : roads) {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }

        // Check if there is a path between any two cities using at most two roads
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && !hasPathWithinTwoRoads(i, j, graph, n)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean hasPathWithinTwoRoads(int start, int target, List<Set<Integer>> graph, int n) {
        boolean[] visited = new boolean[n];

        for (int neighbor : graph.get(start)) {
            visited[neighbor] = true;
            for (int secondNeighbor : graph.get(neighbor)) {
                visited[secondNeighbor] = true;
            }
        }

        return visited[target];
    }

