import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] dp = new int[N][2];
		dp[0][0] = 1;
		dp[0][1] = 1;
		for (int n = 1; n < N; n++) {
			dp[n][0] = (dp[n - 1][0] + dp[n - 1][1] * 2) % 9901;
			dp[n][1] = (dp[n - 1][0] + dp[n - 1][1]) % 9901;
		}
		System.out.println((dp[N - 1][0] + dp[N - 1][1] * 2) % 9901);
		
		sc.close();
	}

}