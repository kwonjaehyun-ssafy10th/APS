import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		BigInteger[] dp = new BigInteger[Math.max(2, N)];
		dp[0] = BigInteger.ONE;
		dp[1] = BigInteger.ONE;
		for (int n = 2; n < N; n++) {
			dp[n] = dp[n - 2].add(dp[n - 1]);
		}
		System.out.println(dp[N - 1]);
		
		sc.close();
	}

}