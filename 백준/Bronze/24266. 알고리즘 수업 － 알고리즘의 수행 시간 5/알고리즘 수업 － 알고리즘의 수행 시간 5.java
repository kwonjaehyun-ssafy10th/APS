import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		System.out.println(n.pow(3));
		System.out.println(3);
		
		sc.close();
	}

}