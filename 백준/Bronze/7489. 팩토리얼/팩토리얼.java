import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			BigInteger f = BigInteger.ONE;
			for (int j = 1; j <= n; j++) {
				f = f.multiply(BigInteger.valueOf(j));
				while (f.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
					f = f.divide(BigInteger.TEN);
				}				
			}
			String ans = f.toString();
			System.out.println(ans.charAt(ans.length() - 1));
		}
		
		sc.close();
	}

}