import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int[][] dp = new int[31][31];
		dp[0][0] = 1;
		for (int i = 1; i < 31; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) dp[i][j] = 1;
				else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}
		
		int T = toInt(br.readLine());
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = toInt(st.nextToken()), M = toInt(st.nextToken());
			bw.write(String.valueOf(dp[M][N]));
			bw.write("\n");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static int toInt(String num) {
		return Integer.parseInt(num);
	}

}