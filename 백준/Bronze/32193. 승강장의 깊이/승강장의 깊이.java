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
		
		int N = toInt(br.readLine());
		int a = 0, b = 0;
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			int A = toInt(st.nextToken()), B = toInt(st.nextToken());
			a += A; b += B;
			bw.write(String.valueOf(a - b));
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