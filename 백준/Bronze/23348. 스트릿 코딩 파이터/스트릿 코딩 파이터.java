import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		for (int n = 0; n < N; n++) {
			int score = 0;
			for (int i = 0; i < 3; i++) {
				int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
				score += A * a + B * b + C * c;
			}
			if (ans < score) {
				ans = score;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}