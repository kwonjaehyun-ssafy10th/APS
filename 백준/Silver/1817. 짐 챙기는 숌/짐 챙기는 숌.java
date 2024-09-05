import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int ans = 0;
		int m = 0;
		for (int n = 0; n < N; n++) {
			int b = sc.nextInt();
			if (m + b <= M) m += b;
			else {
				m = b;
				ans++;
			}
		}
		if (0 < m) ans++;
		System.out.println(ans);
		
		sc.close();
	}

}