import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = toInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			int X = toInt(st.nextToken());
			if (map.containsKey(S)) {
				map.put(S, map.get(S) + X);
			} else {
				map.put(S, X);
			}
		}
		String ans = "NO";
		if (map.containsValue(5)) ans = "YES";
		System.out.println(ans);
		
		br.close();
	}
	
	static int toInt(String string) {
		return Integer.parseInt(string);
	}

}