import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int t2 = 0, t5 = 0;
		long a = 1;
		for (int n = 1; n <= N; n++) {
			int num = n;
			int c2 = 0, c5 = 0;
			while (num % 2 == 0) {
				num /= 2;
				c2++;
			}
			while (num % 5 == 0) {
				num /= 5;
				c5++;
			}
			t2 += c2;
			t5 += c5;
			a *= num;
			a %= 100000;
		}
		while (t2 < t5) {
			a = (a * 5) % 100000;
			t5--;
		}
		while (t5 < t2) {
			a = (a * 2) % 100000;
			t2--;
		}
		a %= 100000;
		System.out.println(String.format("%05d", a));
		
		sc.close();
	}

}