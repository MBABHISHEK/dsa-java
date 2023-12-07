boolean[][][] solution(boolean[][] roadRegister) {
int n = roadRegister.length;
        boolean[][][] result = new boolean[n][n - 1][n - 1];

        for (int removedCity = 0; removedCity < n; removedCity++) {
            int newRow = 0;
            for (int i = 0; i < n; i++) {
                if (i == removedCity) {
                    continue;
                }
                int newCol = 0;
                for (int j = 0; j < n; j++) {
                    if (j == removedCity) {
                        continue;
                    }
                    result[removedCity][newRow][newCol] = roadRegister[i][j];
                    newCol++;
                }
                newRow++;
            }
        }

        return result;
    }
