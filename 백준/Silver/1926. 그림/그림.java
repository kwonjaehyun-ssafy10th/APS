import java.util.Scanner;

public class Main {

	static int n, m, cnt, area, ans;
	static int[][] graph;
	static boolean[][] vis;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); m = sc.nextInt();
		graph = new int[n][m];
		vis = new boolean[n][m];
		for (int r = 0; r < n; r++) { 
			for (int c = 0; c < m; c++) {
				graph[r][c] = sc.nextInt();
			}
		}
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				area = 0;
				if (dfs(r, c)) {
					cnt++;
					if (ans < area)
						ans = area;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(ans);
		
		sc.close();
	}
	
	static boolean dfs(int r, int c) {
		if (vis[r][c] || graph[r][c] == 0)
			return false;
		vis[r][c] = true;
		area++;
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i], nc = c + dc[i];
			if (0 <= nr && nr < n && 0 <= nc && nc < m && graph[nr][nc] == 1 && !vis[nr][nc])
				dfs(nr, nc);
		}
		return true;
	}

}