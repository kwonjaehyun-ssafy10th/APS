import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int M, N, K, cnt, area;
	static boolean[][] vis, graph;
	static List<Integer> list;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt(); N = sc.nextInt(); K = sc.nextInt();
		vis = new boolean[N][M]; graph = new boolean[N][M];
		for (int k = 0; k < K; k++) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					graph[x][y] = true;
				}
			}
		}
		
		cnt = 0;
		list = new ArrayList<Integer>();
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < M; y++) {
				area = 0;
				if (dfs(x, y)) {
					cnt += 1;
					list.add(area);
				}
				
			}
		}
		Collections.sort(list);
		System.out.println(cnt);
		for (int i = 0; i < cnt; i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
		
		sc.close();
	}
	
	static boolean dfs(int r, int c) {
		if (vis[r][c] || graph[r][c]) return false;
		vis[r][c] = true;
		area += 1;
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i], nc = c + dc[i];
			if (0 <= nr && nr < N && 0 <= nc && nc < M && !graph[nr][nc]) {
				dfs(nr, nc);
			}
			
		}
		return true;
	}

}