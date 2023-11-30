import java.util.Scanner;

public class binomialcoefficient {

    static int count = 0;

    public static int computeBinomialDP(int n, int k) {
        int[][] DP = new int[n + 1][k + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0 || j == i) {
                    DP[i][j] = 1;
                } else {
                    DP[i][j] = 0;
                }
            }
        }

        // Fill in the dynamic programming table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i && j <= k; j++) {
                count++;
                DP[i][j] = DP[i - 1][j - 1] + DP[i - 1][j];
            }
        }

        return DP[n][k];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE VALUES OF M AND N");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        count = 0;
        int result = computeBinomialDP(n, k);

        System.out.printf("C(%d, %d) = %d\n", n, k, result);
        System.out.printf("THIS IS THE BASIC OPERATION COUNT IS %d\n", count);
    }
}
