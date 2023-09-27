package 동적계획법.Zero_One_Knapsack_3282;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
			int[][] dp = new int[N + 1][K + 1];
			for (int n = 1; n <= N; n++) {
				st = new StringTokenizer(br.readLine());
				int Vi = Integer.parseInt(st.nextToken()), Ci = Integer.parseInt(st.nextToken());
				for (int k = 1; k <= K; k++) {
					dp[n][k] = dp[n - 1][k];
					if (k > 0 && Vi <= k)
						dp[n][k] = Math.max(dp[n - 1][k], dp[n - 1][k - Vi] + Ci);
				}
			}
			System.out.println(String.format("#%d %d", t, dp[N][K]));
		}

		
		br.close();
		bw.flush();
		bw.close();
	}

}
