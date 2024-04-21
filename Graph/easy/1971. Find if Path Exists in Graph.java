class Solution {
    public boolean solve(List<List<Integer>> graph,int source,int destination,int [] visited)
    {
        if(source==destination)
        return true;
        visited[source]=1;
        for(int neighbor:graph.get(source))
        {
            if(visited[neighbor]==0)
            if(solve(graph,neighbor,destination,visited))
            return true;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int [] edge:edges)
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
         int[] visited = new int[n];
        return solve(graph, source, destination, visited);
    }
}
