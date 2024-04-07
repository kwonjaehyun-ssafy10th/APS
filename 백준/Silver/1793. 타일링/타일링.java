import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println(1);
				continue;
			} else if (n == 1) {
				System.out.println(1);
				continue;
			}
			BigInteger[] dp = new BigInteger[n + 1];
			dp[0] = BigInteger.ONE;
			dp[1] = BigInteger.ONE;
			for (int i = 2; i < n + 1; i++) {
				dp[i] = (dp[i - 2].multiply(BigInteger.ONE.add(BigInteger.ONE))).add(dp[i - 1]);
			}
			System.out.println(dp[n]);
		}
		
		sc.close();
	}

}