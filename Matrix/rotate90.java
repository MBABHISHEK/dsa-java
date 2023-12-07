int[][] solution(int[][] a) {
    
    int n=a.length;
    
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
         {
             int temp= a[i][j];
             a[i][j]=a[j][i];
             a[j][i]=temp;
         }
        
    }
    
    for(int i=0;i<n;i++)
    {
        int left=0;
        int right=n-1;
        
        while(left<right)
        {
             int temp= a[i][left];
             a[i][left]=a[i][right];
             a[i][right]=temp;
             left++;
             right--;
        }
    }
    
    return  a;

}
