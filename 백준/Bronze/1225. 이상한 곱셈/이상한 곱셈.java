import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next(), B = sc.next();
		long a = 0, b = 0;
		for (int i = 0; i < A.length(); i++) {
			a += A.charAt(i) - '0';
		}
		for (int i = 0; i < B.length(); i++) {
			b += B.charAt(i) - '0';
		}
		System.out.println(a * b);
		
		sc.close();
	}

}