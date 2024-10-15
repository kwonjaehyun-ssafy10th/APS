import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(), Y = sc.nextInt();		
		int l = Math.max(6, Y + 1);
		int[] dp = new int[l];
		dp[0] = H;
		for (int i = 1; i < 3; i++) {
			dp[i] = dp[i - 1] * 21 / 20;
		}
		for (int i = 3; i < 5; i++) {
			dp[i] = Math.max(dp[i - 1] * 21 / 20, dp[i - 3] * 6 / 5);
		}
		for (int i = 5; i < l; i++) {
			dp[i] = Math.max(dp[i - 1] * 21 / 20, Math.max(dp[i - 3] * 6 / 5, dp[i - 5] * 27 / 20));
		}
		System.out.println(dp[Y]);
		
		sc.close();
	}

}