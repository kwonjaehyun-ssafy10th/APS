import java.util.Scanner;

public class Main {
	
	static int[][] graph;
	static boolean[][] vis;
	static int N, M, cnt;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		int K = sc.nextInt();
		graph = new int[N][M];
		vis = new boolean[N][M];
		for (int k = 0; k < K; k++) {
			int r = sc.nextInt(), c = sc.nextInt();
			graph[r - 1][c - 1] = 1;
		}
		int ans = 0;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				cnt = 0;
				if (dfs(r, c) && ans < cnt) ans = cnt;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}
	
	static boolean dfs(int r, int c) {
		if (graph[r][c] == 0 || vis[r][c]) return false;
		vis[r][c] = true;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i], nc = c + dc[i];
			if (0 <= nr && nr < N && 0 <= nc && nc < M) dfs(nr,  nc);
		}
		return true;
	}

}