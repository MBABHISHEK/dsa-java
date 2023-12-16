class Solution {
    public void setZeroes(int[][] matrix) {

              if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
              {
                 return;
              }
              int rows=matrix.length;
              int columns=matrix[0].length;
              Set<Integer> rowset=new HashSet<>();
              Set<Integer> cols=new HashSet<>();

              for(int i=0;i<rows;i++)
              {
                  for(int j=0;j<columns;j++)
                  {
                  if(matrix[i][j]==0)
                  {
                  rowset.add(i);
                  cols.add(j);
                  }
                  }

              }

              for(Integer k:rowset)
              {
                  for(int i=0;i<columns;i++)
                   matrix[k][i]=0;
              }

              for(Integer k:cols)
              {
                  for(int i=0;i<rows;i++)
                  matrix[i][k]=0;
              }
    }
}
