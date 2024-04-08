class Solution {

    static ArrayList<Integer> graph[];
    static int v;
    static int e;

    static void addEdge(int a, int b){
        graph[b].add(a);
    }


    public int[] findOrder(int num, int[][] pre) {

        v = num;
        e = pre.length;
        graph = new ArrayList[v];

        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<pre.length; i++){
            addEdge(pre[i][0],pre[i][1]);
        }

        int indegree[] = new int[v];

        for(int i=0; i<pre.length; i++){
            indegree[pre[i][0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<v; i++){
            if(indegree[i]==0) q.add(i);
        }

        if(q.size()==0){
            int arr[] = {};
            return arr;
        }
        int ans[] = new int[v];
        int idx = 0;

        while(q.size()!=0){
            int a = q.remove();
            ans[idx++] = a;
            for(var x : graph[a]){
                indegree[x]--;
                if(indegree[x]==0) q.add(x);
            }
        }
        if(idx!=v){
            int arr[] = {};
            return arr;
        }else return ans;

    }
}
