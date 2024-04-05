class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int [][]val=new int[triangle.size()][triangle.size()];
        for(int []temp:val)
        Arrays.fill(temp,-10001);
        return find(triangle,0,0,val);
    }

    static int find(List<List<Integer>> triangle,int i,int j,int [][]val)
    {
        if(i==triangle.size())
            return 0;
        if(val[i][j]!=-10001)
            return val[i][j];

        int a=triangle.get(i).get(j)+find(triangle,i+1,j,val);
        int b=triangle.get(i).get(j)+find(triangle,i+1,j+1,val);
        return val[i][j]=Math.min(a,b);        
    }
}
