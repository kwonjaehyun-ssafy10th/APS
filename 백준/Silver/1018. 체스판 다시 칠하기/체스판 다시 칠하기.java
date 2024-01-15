import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] map = new char[N][M];
		for (int n = 0; n < N; n++) {
			String line = sc.next();
			for (int m = 0; m < M; m++) {
				map[n][m] = line.charAt(m);
			}
		}
		
		int ans = N * M;
		for (int k = 0; k <= N - 8; k++) {
			for (int l = 0; l <= M - 8; l++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						char c = map[k + i][l + j];
						if (i % 2 == j % 2) {
							if (c == 'W') cnt1++;
							else cnt2++;
						} else if (i % 2 != j % 2) {
							if (c == 'B') cnt1++;
							else cnt2++;
						}
					}
				}
				cnt1 = Math.min(cnt1, N * M - cnt1);
				cnt2 = Math.min(cnt2, N * M - cnt2);
				int cnt = Math.min(cnt1,  cnt2);
				if (cnt < ans) {
					ans = cnt;
				}
			}
		}
		System.out.println(ans);

		sc.close();
	}

}