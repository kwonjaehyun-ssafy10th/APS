import java.util.Scanner;

public class Main {

	static int M, N;
	static int[][] graph;
	static boolean[][] vis;
	static int[] dr = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dc = { -1, 0, 1, 1, 1, 0, -1, -1 };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt(); N = sc.nextInt();
		graph = new int[M][N];
		vis = new boolean[M][N];
		for (int r = 0; r < M; r++) {
			for (int c = 0; c < N; c++) {
				graph[r][c] = sc.nextInt();
			}
		}
		int cnt = 0;
		for (int r = 0; r < M; r++) {
			for (int c = 0; c < N; c++) {
				if (dfs(r, c)) cnt++; 
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}
	
	static boolean dfs(int r, int c) {
		if (vis[r][c] || graph[r][c] == 0) return false;
		vis[r][c] = true;
		for (int i = 0; i < 8; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (0 <= nr && nr < M && 0 <= nc && nc < N) dfs(nr, nc);
		}
		return true;
	}

}