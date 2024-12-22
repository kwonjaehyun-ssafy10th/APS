import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			float n = Float.parseFloat(st.nextToken());
			while (st.hasMoreTokens()) {
				char o = st.nextToken().charAt(0);
				if (o == '@') n *= 3;
				else if (o == '%') n += 5;
				else if (o == '#') n -= 7;
			}
			System.out.println(String.format("%.2f", n));
		}
		
		br.close();
	}

}