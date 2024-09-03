import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong(), b = sc.nextLong();
			long q = a, r = b;
			while (r != 0) {
				long temp = q;
				q = r;
				r = temp % r;
			}
			System.out.println(a * b / q);
		}
		
		sc.close();
	}

}