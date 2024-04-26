import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			List<int[]> list = new ArrayList<>();
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int n = 0; n < N; n++) {
				int s = Integer.parseInt(st.nextToken());
				list.add(new int[] {s, 1});
			}
			st = new StringTokenizer(br.readLine());
			for (int m = 0; m < M; m++) {
				int b = Integer.parseInt(st.nextToken());
				list.add(new int[] {b, 0});
			}
			Collections.sort(list, new Comparator<int[]>() {
				public int compare(int[] t1, int[] t2) {
					if (t1[0] == t2[0]) return t1[1] - t2[1];
					return t1[0] - t2[0];
				}
			});
			int[] last = list.get(N + M - 1);
			String ans;
			if (last[1] == 1) ans = "S";
			else ans = "B";
			System.out.println(ans);
			
		}
		
		
		br.close();
	}

}