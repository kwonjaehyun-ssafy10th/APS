import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] dp = new int[N + 1];
		dp[0] = 1;
		for (int n = 1; n < N + 1; n++) {
			dp[n] = (dp[n - 1] + n * 3 + 1) % 45678;
		}
		System.out.println(dp[N]);
		
		sc.close();
	}
	
}