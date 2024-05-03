import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ans = 0;
		for (int n = 1; n <= N; n++) {
			int s = 0;
			int i = n;
			while (0 < i) {
				s += i % 10;
				i /= 10;
			}
			if (n % s == 0) ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}