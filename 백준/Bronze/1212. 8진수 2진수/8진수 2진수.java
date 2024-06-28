import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger(8);
		System.out.println(a.toString(2));
		
		sc.close();
	}

}