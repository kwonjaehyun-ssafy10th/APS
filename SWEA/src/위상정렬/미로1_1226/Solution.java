package 위상정렬.미로1_1226;

import java.util.Scanner;

public class Solution {

	static int[][] graph;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int N = 16;
	static int ans;
	static boolean flag;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		for (int t = 1; t <= T; t++) {
			t = sc.nextInt();
			ans = 0;
			flag = false;
			graph = new int[16][16];
			visited = new boolean[16][16];
			int startR = 0, startC = 0;
		
			for (int r = 0; r < 16; r++) {
				String str = sc.next();
				for (int c = 0; c < 16; c++) {
					graph[r][c] = Character.getNumericValue(str.charAt(c));
					if (graph[r][c] == 2) {
						startR = r; startC = c;
					}
				}
			}
			
			
			dfs(startR,startC);
			System.out.println(String.format("#%d %d", t, ans));
			
		}
		
		sc.close();
	}
	
	static void dfs(int r, int c) {
		if (flag) return;
		if (graph[r][c] == 3) {
			ans = 1;
			flag = true;
			return;
		}
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i], nc = c + dc[i];
			if (0 <= nr && nr < N && 0 <= nc && nc < N && !visited[nr][nc] && graph[nr][nc] != 1) {
				visited[nr][nc] = true;
				dfs(nr, nc);
			}
		}
		
	}

}
