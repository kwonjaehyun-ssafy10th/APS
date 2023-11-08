import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static List<int[]> tomato;
	static int[][] graph;
	static boolean[][] vis;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	static int M, N, ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt(); N = sc.nextInt();
		graph = new int[N][M];
		tomato = new ArrayList<>();
		vis = new boolean[N][M];
		for (int n = 0; n < N; n++) {
			for (int m = 0; m < M; m++) {
				graph[n][m] = sc.nextInt();
				if (graph[n][m] == 1) {
					tomato.add(new int[] {n, m, 0});
				}
			}
		}
		bfs();
		boolean flag = false;
		outer: for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (graph[r][c] == 0) {
					flag = true;
					break outer;
				}
			}
		}
		
		if (flag) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
		
		sc.close();
	}
	
	public static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		for (int[] t:tomato) {
			q.add(t);
		}
		while (!q.isEmpty()) {
			int[] t = q.poll();
			int r = t[0], c = t[1], d = t[2];
			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i], nc = c + dc[i];
				if (0 <= nr && nr < N && 0 <= nc && nc < M && !vis[nr][nc] && graph[nr][nc] == 0) {
					vis[nr][nc] = true;
					graph[nr][nc] = 1;
					q.add(new int[] {nr, nc, d + 1});
					ans = Math.max(ans, d + 1);
				}
			}
		}
	}

}