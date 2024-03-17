import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[][] arr = new int[N][M];
		for (int n = 0; n < N; n++) {
			for (int m = 0; m < M; m++) {
				arr[n][m] = sc.nextInt();
			}
		}
		int K = sc.nextInt();
		for (int k = 0; k < K; k++) {
			int i = sc.nextInt(), j = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			int ans = 0;
			for (int r = i - 1; r < x; r++) {
				for (int c = j - 1; c < y; c++) {
					ans += arr[r][c];
				}
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}