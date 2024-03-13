import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[][] graph = new int[N][M];
		for (int n = 0; n < N; n++) {
			String line = sc.next();
			for (int m = 0; m < M; m++) {
				graph[n][m] = line.charAt(m) - '0';
			}
		}
		int[][] flip = new int[N][M];
		int cnt = 0;
		for (int r = N - 1; 0 <= r; r--) {
			for (int c = M - 1; 0 <= c; c--) {
				if ((graph[r][c] ^ (flip[r][c] % 2)) == 1) {
					cnt++;
					for (int i = 0; i <= r; i++) {
						for (int j = 0; j <= c; j++) {
							flip[i][j]++;
						}
					}
				}
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}

}