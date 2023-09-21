package Graph2.치즈_도둑_7733;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static int nextInt() throws NumberFormatException, IOException {
		return Integer.parseInt(br.readLine());
	}
	
	static int[] nextIntLine(int length) throws IOException {
		String str = br.readLine();
		st = new StringTokenizer(str);
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		return arr;
	}
	
	static String input() throws IOException {
		return br.readLine();
	}
	
	static void print(String s) throws IOException {
		bw.write(s);
	}
	
	static void println(String s) throws IOException {
		bw.write(s);
		bw.newLine();
	}
	
	static void print(int i) throws IOException {
		bw.write(Integer.toString(i));
	}
	
	static void flush() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}

}

public class Solution {

	static int N;
	static int[][] graph;
	static boolean[][] visited;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {

		int T = A.nextInt();
		for (int t = 1; t <= T; t++) {
			int ans = 1;
			N = A.nextInt();
			graph = new int[N][N];
			for (int n = 0; n < N; n++) {
				graph[n] = A.nextIntLine(N);
			}
			int max = 0;
			for (int d = 1; d <= 100; d++) {
				int cnt = 0;
				visited = new boolean[N][N];
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (graph[r][c] <= d) {
							visited[r][c] = true;
						}
						if (dfs(r, c, d)) cnt++;
					}
				}
				if (max < cnt) {
					max = cnt;
				}
			}
			ans = max;
			A.println(String.format("#%d %d", t, ans));
		}
		
		A.flush();
	}
	
	static boolean dfs(int r, int c, int day) {
		if (r < 0 || N <= r || c < 0 || N <= c) return false;
		if (graph[r][c] > day && !visited[r][c]) {
			visited[r][c] = true;
			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				dfs(nr, nc, day);
			}
			return true;
		}
		return false;		
	}
}
