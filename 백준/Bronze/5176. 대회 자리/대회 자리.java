import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		for (int k = 0; k < K; k++) {
			int P = sc.nextInt(), M = sc.nextInt();
			boolean[] s = new boolean[M];
			int ans = 0;
			for (int p = 0; p < P; p++) {
				int m = sc.nextInt() - 1;
				if (s[m]) ans++;
				else s[m] = true;
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}