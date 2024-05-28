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
		StringBuilder sb;
		StringTokenizer st;

		int[] c = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String t = "No", d = "No";
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			if (0 <= x && x < 24 && 0 <= y && y < 60) t = "Yes";
			if (1 <= x && x < 13 && 1 <= y && y <= c[x]) d = "Yes";
			sb = new StringBuilder();
			sb.append(t).append(" ").append(d);
			bw.write(String.valueOf(sb));
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}