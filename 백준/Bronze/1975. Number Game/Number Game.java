import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int ans = 0;
			for (int b = 2; b <= N / 2; b++) {
				int n = N;
				while (0 < n) {
					if (n % b == 0) {
						ans++;
						n /= b;
					} else break;
				}
			}
			if (N != 1) ans++;
			System.out.println(ans);
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}