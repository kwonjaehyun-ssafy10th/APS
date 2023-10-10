import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int[][]dp = new int[2][n];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < n; j++) {
					dp[i][j] = sc.nextInt();
				}
			}
			
			if (n == 1) {
				System.out.println(Math.max(dp[0][0], dp[1][0]));
			} else {
				dp[0][1] = dp[1][0] + dp[0][1];
				dp[1][1] = dp[0][0] + dp[1][1];
				for (int i = 0; i < n - 2; i++) {
					dp[0][i + 2] = Math.max(Math.max(dp[0][i], dp[1][i]), dp[1][i + 1]) + dp[0][i + 2];
					dp[1][i + 2] = Math.max(Math.max(dp[0][i], dp[1][i]), dp[0][i + 1]) + dp[1][i + 2];
				}
				System.out.println(Math.max(Math.max(dp[0][n - 2], dp[1][n - 2]), Math.max(dp[0][n - 1], dp[1][n - 1])));
			}
			
		}
		
		sc.close();
	}

}