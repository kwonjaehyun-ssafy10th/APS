import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			boolean[] arr = new boolean[n + 1];
			for (int i = 1; i <= n; i++) {
				for (int j = i; j <= n; j += i) {
					if (arr[j]) arr[j] = false;
					else arr[j] = true;
				}
			}
			int ans = 0;
			for (int i = 1; i <= n; i++) {
				if (arr[i]) ans++;
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}