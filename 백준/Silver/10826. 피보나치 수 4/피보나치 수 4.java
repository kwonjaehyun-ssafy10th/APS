import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
		int i = 1;
		while (i < n) {
			BigInteger temp = a;
			a = b;
			b = b.add(temp);
			i++;
		}
		BigInteger ans = BigInteger.ZERO;
		if (n != 0) ans = b;
		System.out.println(ans);
		
		sc.close();
	}

}