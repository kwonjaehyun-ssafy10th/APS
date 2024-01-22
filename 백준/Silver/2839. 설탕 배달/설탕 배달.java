import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int ans = 0;
		int N = sc.nextInt();
		int[] dp = new int[N + 1];
		if (3 <= N) dp[3] = 1;
		if (5 <= N) dp[5] = 1;
		for (int n = 6; n < N + 1; n++) {
			if (dp[n - 3] == 0 && dp[n - 5] == 0) {
				continue;
			} else if (dp[n - 3] == 0) {
				dp[n] = dp[n - 5] + 1;
			} else if (dp[n - 5] == 0) {
				dp[n] = dp[n - 3] + 1;
			} else {
				dp[n] = Math.min(dp[n - 5], dp[n - 3]) + 1;
			}
		}
		if (dp[N] == 0) ans = -1;
		else ans = dp[N];
		System.out.println(ans);
		
		sc.close();
	}

}