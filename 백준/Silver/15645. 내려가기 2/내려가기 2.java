import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = toInt(br.readLine());
		int[][] dp = new int[2][3];
		int[][] temp = new int[2][3];
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			int a = toInt(st.nextToken()), b = toInt(st.nextToken()), c = toInt(st.nextToken());
			temp[0][0] = Math.max(dp[0][0], dp[0][1]) + a;
			temp[0][1] = Arrays.stream(dp[0]).max().getAsInt() + b;
			temp[0][2] = Math.max(dp[0][1], dp[0][2]) + c;
			temp[1][0] = Math.min(dp[1][0], dp[1][1]) + a;
			temp[1][1] = Arrays.stream(dp[1]).min().getAsInt() + b;
			temp[1][2] = Math.min(dp[1][1], dp[1][2]) + c;
			dp[0] = Arrays.copyOf(temp[0], 3);
			dp[1] = Arrays.copyOf(temp[1], 3);
		}
		System.out.println(Arrays.stream(dp[0]).max().getAsInt() + " " + Arrays.stream(dp[1]).min().getAsInt());
		
		
		br.close();
	}
	
	static int toInt(String string) {
		return Integer.parseInt(string);
	}

}