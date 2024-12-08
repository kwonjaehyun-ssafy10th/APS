import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next(), B = sc.next();
		int l = Math.max(A.length(), B.length());
		A = String.format("%0" + l + "d", Integer.parseInt(A));
		B = String.format("%0" + l + "d", Integer.parseInt(B));
		for (int i = 0; i < l; i++) {
			System.out.print((A.charAt(i) - '0') + (B.charAt(i) - '0'));
		}
		
		sc.close();
	}

}