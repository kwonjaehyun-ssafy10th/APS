import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		BigInteger M = BigInteger.valueOf(Math.max(A, B)), m = BigInteger.valueOf(Math.min(A, B));
		BigInteger ans =  (M.add(m)).multiply(M.subtract(m).add(BigInteger.ONE)).divide(BigInteger.ONE.add(BigInteger.ONE));
		System.out.println(ans);
		
		sc.close();
	}

}