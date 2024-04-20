class Solution {
    public int[][] findFarmland(int[][] land) {
        int rows = land.length;
        int cols = land[0].length;
        List<int[]> result = new ArrayList<>();
        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    int[] farmland = {i, j, i, j}; // [min_row, min_col, max_row, max_col]
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                    
                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int curRow = curr[0];
                        int curCol = curr[1];
                        
                        for (int[] dir : directions) {
                            int newRow = curRow + dir[0];
                            int newCol = curCol + dir[1];
                            
                            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols &&
                                land[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                                queue.offer(new int[]{newRow, newCol});
                                visited[newRow][newCol] = true;
                                farmland[2] = Math.max(farmland[2], newRow); // update max_row
                                farmland[3] = Math.max(farmland[3], newCol); // update max_col
                            }
                        }
                    }
                    
                    result.add(farmland);
                }
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
}
