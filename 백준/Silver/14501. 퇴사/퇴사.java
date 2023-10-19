import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		for (int n = 0; n < N; n++) {
			int T = sc.nextInt(), P = sc.nextInt();
			arr[n] = new int[] {T, P};
		}
		int[] dp = new int[N + 1];
		for (int i = 0; i < N; i++) {
			for (int j = i + arr[i][0]; j <= N; j++) {
				dp[j] = Math.max(dp[j], dp[i] + arr[i][1]);
			}
		}
		System.out.println(dp[N]);
		
		sc.close();
	}

}