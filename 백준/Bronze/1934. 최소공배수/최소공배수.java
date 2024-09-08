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
		
		int T = toInt(br.readLine());
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int A = toInt(st.nextToken()), B = toInt(st.nextToken());
			int q = A, r = B;
			while (r != 0) {
				int temp = q;
				q = r;
				r = temp % r;
			}
			bw.write(String.valueOf(A * B / q));
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static int toInt(String string) {
		return Integer.parseInt(string);
	}

}