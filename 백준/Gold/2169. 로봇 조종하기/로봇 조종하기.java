import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = toInt(st.nextToken()), M = toInt(st.nextToken());
		int[][] map = new int[N][M];
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			for (int m = 0; m < M; m++) {
				map[n][m] = toInt(st.nextToken());
			}
		}
		int[][][] dp = new int[N][M][3];
		for (int i = 0; i < 3; i++) {
			dp[0][0][i] = map[0][0];
		}
		for (int m = 1; m < M; m++) {
			for (int i = 0; i < 3; i++) {
				dp[0][m][i] = dp[0][m - 1][0] + map[0][m];
			}
		}
		for (int n = 1; n < N; n++) {
			for (int m = 0; m < M; m++) {
				dp[n][m][2] = max(dp[n - 1][m]) + map[n][m];
				dp[n][M - 1 - m][2] = max(dp[n - 1][M - 1 - m]) + map[n][M - 1 - m];
				if (m == 0) {
					dp[n][m][1] = dp[n][m][2];
					dp[n][M - 1 - m][0] = dp[n][M - 1 - m][2];
				} else {
					dp[n][m][1] = Math.max(dp[n][m - 1][1], dp[n][m - 1][2]) + map[n][m];
					dp[n][M - 1 - m][0] = Math.max(dp[n][M - m][0], dp[n][M - m][2]) + map[n][M - 1 - m];
				}
			
			}
		}
		System.out.println(max(dp[N - 1][M - 1]));
		
		br.close();
	}
	
	static int toInt(String string) {
		return Integer.parseInt(string);
	}
	
	static int max(int[] arr) {
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (res < arr[i]) res = arr[i];
		}
		return res;
	}

}