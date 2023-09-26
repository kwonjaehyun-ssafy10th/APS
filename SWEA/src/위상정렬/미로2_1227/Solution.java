package 위상정렬.미로2_1227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {

	static int[][] graph;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int N = 100;
	static int ans;
	static boolean flag;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = 10;
		for (int t = 1; t <= T; t++) {
			t = Integer.parseInt(br.readLine());
			ans = 0;
			flag = false;
			graph = new int[N][N];
			visited = new boolean[N][N];
			int startR = 0, startC = 0;
		
			for (int r = 0; r < N; r++) {
				String str = br.readLine();
				for (int c = 0; c < N; c++) {
					graph[r][c] = Character.getNumericValue(str.charAt(c));
					if (graph[r][c] == 2) {
						startR = r; startC = c;
					}
				}
			}
			
			dfs(startR,startC);
			bw.write(String.format("#%d %d\n", t, ans));
		}
		
		br.close();
		bw.flush();
		bw.close();
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
