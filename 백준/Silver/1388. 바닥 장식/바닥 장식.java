import java.util.Scanner;

public class Main {

	static int N, M;
	static char[][] graph;
	static boolean[][] vis;
	static char prev;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); M = sc.nextInt();
		graph = new char[N][M];
		vis = new boolean[N][M];
		for (int r = 0; r < N; r++) {
			String line = sc.next();
			for (int c = 0; c < M; c++) {
				graph[r][c] = line.charAt(c);
			}
		}
		int cnt = 0;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				prev = graph[r][c];
				if (dfs(r, c)) cnt++;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}
	
	static boolean dfs(int r, int c) {
		char cur = graph[r][c];
		if (vis[r][c] || prev != cur) return false;
		vis[r][c] = true;
		if (cur == '-') {
			if (c < M - 1) {
				dfs(r,  c + 1);
			}
		} else if (cur == '|') {
			if (r < N - 1) {
				dfs(r + 1, c);
			}
		}
		return true;
	}

}