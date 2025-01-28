import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		int a = 1, b = 1;
		for (int n = 0; n < N; n++) {
			a += A;
			b += B;
			if (a < b) {
				int temp = a;
				a = b;
				b = temp;
			} else if (a == b) {
				b--;
			}
		}
		System.out.println(a + " " + b);
		
		sc.close();
	}

}