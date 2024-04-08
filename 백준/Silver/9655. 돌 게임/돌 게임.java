import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean[] dp = new boolean[Math.max(4, N + 1)];
		dp[1] = true;
		dp[3] = true;
		for (int n = 4; n < N + 1; n++) {
			if (dp[n - 4]) {
				dp[n] = true;
			}
		}
		String ans = "CY";
		if (dp[N]) ans = "SK";
		System.out.println(ans);
		
		sc.close();
	}

}