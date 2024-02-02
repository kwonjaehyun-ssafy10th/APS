import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] dp = new int[Math.max(N + 1, 4)];
		dp[2] = dp[3] = 1;
		for (int n = 4; n < N + 1; n++) {
			dp[n] = dp[n - 1] + 1;
			if (n % 2 == 0) {
				dp[n] = Math.min(dp[n], dp[n / 2] + 1);
			}
			if (n % 3 == 0) {
				dp[n] = Math.min(dp[n], dp[n / 3] + 1);
			}
		}
		System.out.println(dp[N]);
		
		sc.close();
	}

}