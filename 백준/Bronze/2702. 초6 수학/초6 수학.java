import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int q = a, r = b;
			while (0 < r) {
				int temp = q;
				q = r;
				r = temp % r;
			}
			int lcm = a * b / q, gcd = q;
			System.out.println(lcm + " " + gcd);
		}
		
		sc.close();
	}

}