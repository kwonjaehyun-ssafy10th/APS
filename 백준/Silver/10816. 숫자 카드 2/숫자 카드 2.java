import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine());
		for (int n = 0; n < N; n++) {
			int num = Integer.parseInt(st.nextToken());
			if (map.containsKey(num)) map.put(num, map.get(num) + 1);
			else map.put(num,  1);
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int m = 0; m < M; m++) {
			int num = Integer.parseInt(st.nextToken());
			if (map.containsKey(num)) bw.write(map.get(num) + " ");
			else bw.write(0 + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}