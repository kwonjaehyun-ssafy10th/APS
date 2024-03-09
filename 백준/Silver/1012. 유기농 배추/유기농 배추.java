import java.util.Scanner;

public class Main {

	static int N, M, K;
	static int[][] graph;
	static boolean[][] vis;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			M = sc.nextInt(); N = sc.nextInt(); K = sc.nextInt();
			graph = new int[N][M];
			vis = new boolean[N][M];
			for (int k = 0; k < K; k++) {
				int X = sc.nextInt(), Y = sc.nextInt();
				graph[Y][X] = 1;
			}
			cnt = 0;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < M; c++) {
					if (dfs(r, c)) cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}
	
	static boolean dfs(int r, int c) {
		if (vis[r][c] || graph[r][c] == 0) return false;
		vis[r][c] = true;
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (0 <= nr && nr < N && 0 <= nc && nc < M) {
				dfs(nr,  nc);
			}
		}
		return true;
	}

}