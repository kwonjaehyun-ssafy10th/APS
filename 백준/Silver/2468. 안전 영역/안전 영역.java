import java.util.Scanner;

public class Main {

	static int N;
	static int[][] graph;
	static boolean[][] vis;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		graph = new int[N][N];
		int maxHeight = 0;
		int ans = 1;
		int cnt;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				graph[r][c] = sc.nextInt();
				if (maxHeight < graph[r][c]) {
					maxHeight = graph[r][c];
				}
			}
		}
		for (int h = 1; h < maxHeight; h++) {
			cnt = 0;
			vis = new boolean[N][N];
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if (dfs(r, c, h)) cnt += 1;
				}
			}
			if (ans < cnt) ans = cnt;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
	
	static boolean dfs(int r, int c, int h) {
		if (vis[r][c] || graph[r][c] <= h) {
			return false;
		}
		vis[r][c] = true;
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (0 <= nr && nr < N && 0 <= nc && nc < N) {
				dfs(nr, nc, h);
			}
		}
		return true;
	}

}