import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			if (N == 0 && M == 0) break;
			Set<Integer> set = new HashSet<>();
			for (int n = 0; n < N; n++) {
				set.add(Integer.parseInt(br.readLine()));
			}
			int cnt = 0;
			for (int m = 0; m < M; m++) {
				if (set.contains(Integer.parseInt(br.readLine()))) cnt++;
			}
			bw.write(String.valueOf(cnt));
			bw.newLine();
		}
		
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}