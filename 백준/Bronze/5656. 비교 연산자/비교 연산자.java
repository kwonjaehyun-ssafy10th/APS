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
		
		int i = 1;
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String o = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			if ("E".equals(o)) break;
			bw.write(String.format("Case %d: %s\n", i++, comp(a, o, b)));
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static Boolean comp(int a, String o, int b) {
		if (">".equals(o)) return a > b;
		else if (">=".equals(o)) return a >= b;
		else if ("<".equals(o)) return a < b;
		else if ("<=".equals(o)) return a <= b;
		else if ("==".equals(o)) return a == b;
		else if ("!=".equals(o)) return a != b;
		return false;
	}

}