import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), X = sc.nextInt();
		int ans = -1;
		for (int n = 0; n < N; n++) {
			int S = sc.nextInt(), T = sc.nextInt();
			if (S + T <= X && ans < S) ans = S;
		}
		System.out.println(ans);
		
		sc.close();
	}

}