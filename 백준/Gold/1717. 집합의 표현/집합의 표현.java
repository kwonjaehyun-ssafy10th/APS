import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[] p;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = toInt(st.nextToken()), m = toInt(st.nextToken());
		p = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			p[i] = i;
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int o = toInt(st.nextToken()), a = toInt(st.nextToken()), b = toInt(st.nextToken());
			if (o == 0) union(a, b);
			else {
				if (find(a) == find(b)) System.out.println("YES");
				else System.out.println("NO");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static int toInt(String s) {
		return Integer.parseInt(s);
	}
	
	static int find(int x) {
		if (p[x] == x) return x;
		else {
			p[x] = find(p[x]);
			return p[x];
		}
	}
	
	static void union(int x, int y) {
		int xParent = find(x), yParent = find(y);
		if (xParent < yParent) {
			p[yParent] = xParent;
		} else {
			p[xParent] = yParent;
		}
	}

}