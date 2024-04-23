class Solution {
    List<Integer> res;
    int minDepth = Integer.MAX_VALUE;
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 1) return Arrays.asList(0);
        res = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList<>();
        int[] inLinks = new int[n];
        // Creating empty graph
        for(int i = 0 ; i < n ; i++) graph.add(new ArrayList<>());
        // Creating graph
        for(int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
            inLinks[edge[0]]++;
            inLinks[edge[1]]++;
        }

        List<Integer> leafs = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            if(inLinks[i] == 1) leafs.add(i);
        }

        while(n > 2) {
            n -= leafs.size();
            List<Integer> newLeafs = new ArrayList<>();
            for(int leaf : leafs) {
                for(int node : graph.get(leaf)) {
                    inLinks[node]--;
                    if(inLinks[node] == 1) {
                        newLeafs.add(node);
                    }
                }
            }
            leafs = newLeafs;
        }
        return leafs;
    }
}
