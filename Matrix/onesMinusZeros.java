class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] onesRow = new int[m];
        int[] onesCol = new int[n];

        // Calculate the number of ones and zeros for each row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                } 
            }
        }

        // Create the difference matrix
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = 2*onesRow[i] + 2*onesCol[j] - m-n;
            }
        }

        return diff;
    }
}
