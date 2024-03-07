import java.util.Scanner;

public class Main {

	static int N, M;
	static char[][] graph;
	static boolean[][] vis;
	static int cntW, cntB, ttlW, ttlB;
	static char prev;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		graph = new char[M][N];
		vis = new boolean[M][N];
		
		for (int m = 0; m < M; m++) {
			String line = sc.next();
			for (int n = 0; n < N; n++) {
				graph[m][n] = line.charAt(n);
			}
		}
		ttlW = 0;
		ttlB = 0;
		for (int r = 0; r < M; r++) {
			for (int c = 0; c < N; c++) {
				cntW = 0;
				cntB = 0;
				prev = '0';
				if (dfs(r, c)) {
					ttlW += cntW * cntW;
					ttlB += cntB * cntB;
				}
			}
		}
		System.out.println(ttlW + " " + ttlB);
		
		sc.close();
	}
	
	static boolean dfs(int r, int c) {
		if (prev == '0') prev = graph[r][c];
		if (vis[r][c] || prev != graph[r][c]) return false;
		vis[r][c] = true;
		if (graph[r][c] == 'W') cntW++;
		else cntB++;
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (0 <= nr && nr < M && 0 <= nc && nc < N) {
				dfs(nr, nc);
			}
		}
		return true;
	}

}