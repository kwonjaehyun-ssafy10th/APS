import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int S = sc.nextInt(), F = sc.nextInt();
			int c = (F - S) % 4;
			int dp[];
			if (S % 2 == 1) {
				dp = new int[4];
				dp[0] = S;
				for (int i = 0; i < Math.min(3, F - S); i++) {
					dp[i + 1] = dp[i] ^ (F - c + 1 + i);
				}
			} else {
				dp = new int[4];
				dp[1] = 1;
				dp[0] = F - c;
				dp[2] = 1 ^ (F - c + 2);
			}
			System.out.println(dp[c]);
		}
		
		sc.close();
	}

}