import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for (int n = 1; n <= N; n++) {
			String A = br.readLine(), B = br.readLine();
			Map<Character, Integer> aMap = new HashMap<>(), bMap = new HashMap<>();
			for (int i = 0; i < A.length(); i++) {
				char a = A.charAt(i);
				if (aMap.containsKey(a)) aMap.put(a, aMap.get(a) + 1);
				else aMap.put(a, 1);
			}
			for (int i = 0; i < B.length(); i++) {
				char b = B.charAt(i);
				if (bMap.containsKey(b)) bMap.put(b, bMap.get(b) + 1);
				else bMap.put(b, 1);
			}
			int ans = 0;
			for (char a: aMap.keySet()) {
				if (bMap.containsKey(a)) ans += Math.abs(aMap.get(a) - bMap.get(a));
				else ans += aMap.get(a);
			}
			for (char b: bMap.keySet()) {
				if (!aMap.containsKey(b)) ans += bMap.get(b);
			}
			bw.write(String.format("Case #%d: %d", n, ans));
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}