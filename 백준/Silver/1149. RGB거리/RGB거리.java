import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] dp = new int[3];
		for (int i = 0; i < 3; i++) {
			dp[i] = sc.nextInt();
		}
		
		for (int n = 0; n < N - 1; n++) {
			int[] a = new int[3];
			for (int i = 0; i < 3; i++) {
				a[i] = sc.nextInt();
			}
			int[] temp = new int[3];
			for (int i = 0; i < 3; i++) {
				temp[i] = dp[i];
			}
			for (int i = 0; i < 3; i++) {
				dp[0] = Math.min(temp[1], temp[2]) + a[0];
				dp[1] = Math.min(temp[0], temp[2]) + a[1];
				dp[2] = Math.min(temp[0], temp[1]) + a[2];
			}
		}
		
		int ans = Integer.MAX_VALUE; 
		for (int i = 0; i < 3; i++) {
			ans = Math.min(ans,  dp[i]);
		}
		System.out.println(ans);
		
		sc.close();
	}

}