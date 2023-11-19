import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] dp = new int[N + 1];
		for (int n = 0; n < N; n++) {
			A[n] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 1; i < N + 1; i++) {
			int idx = 0;
			for (int j = 0; j < i; j++) {
				int a;
				if (0 < j) {
					a = A[j - 1];
				} else {
					a = 0;
				}
				if (a < A[i - 1] && dp[idx] < dp[j]) {
					idx = j;
				}
			}
			dp[i] = dp[idx] + 1;
			if (ans < dp[i]) ans = dp[i];
		}
		System.out.println(ans);
		
		sc.close();
	}

}