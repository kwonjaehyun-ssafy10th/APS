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
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		st = new StringTokenizer(br.readLine());
		for (int n = 0; n < N; n++) {
			int m = Integer.parseInt(st.nextToken());
			if (m < min) min = m;
			if (max < m) max = m;
		}
		bw.write(min + " " + max);
		bw.flush();
		br.close();
		bw.close();
	}
}