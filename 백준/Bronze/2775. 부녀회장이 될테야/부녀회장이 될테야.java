import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[] dp = new int[n];
			for (int i = 0; i < n; i++) {
				dp[i] = i + 1;
			}
			for (int i = 0; i < k; i++) {
				for (int j = 1; j < n; j++) {
					dp[j] = dp[j - 1] + dp[j];
					if (i == k - 1 && j == n - 1) break;
				}
			}
			System.out.println(dp[n - 1]);
		}
		
		sc.close();
	}

}