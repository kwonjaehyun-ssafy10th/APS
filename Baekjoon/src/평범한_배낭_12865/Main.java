package 평범한_배낭_12865;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), K = sc.nextInt();
		int[][] item = new int[N + 1][2];
		for (int n = 1; n <= N; n++) {
			for (int i = 0; i < 2; i++) {
				item[n][i] = sc.nextInt();
			}
		}
		int[][] dp = new int[N + 1][K + 1];
		for (int n = 1; n <= N; n++) {
			int W = item[n][0], V = item[n][1];
			for (int k = 1; k <= K; k++) {
				dp[n][k] = dp[n - 1][k];
				if (W <= k) dp[n][k] = Math.max(dp[n - 1][k], dp[n - 1][k - W] + V);
			}
		}
		System.out.println(dp[N][K]);
		
		sc.close();
	}
	
}
