import java.util.Scanner;

public class Main {
	
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	static int ans, R, C;
	static char[][] graph;
	static boolean[] visited = new boolean[26];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		R = sc.nextInt(); C = sc.nextInt();
		graph = new char[R][C];
		for (int r = 0; r < R; r++) {
			String str = sc.next();
			for (int c = 0; c < C; c++) {
				graph[r][c] = str.charAt(c);
			}
		}
		
		ans = 0;
		recur(0, 0);
		System.out.println(ans);
		
		sc.close();
	}

	static void recur(int r, int c) {
		visited[(int) graph[r][c] - (int) 'A'] = true;
		int cnt = 0;
		for (int i = 0; i < 26; i++) {
			if (visited[i]) cnt++;
		}
		ans = Math.max(ans, cnt);
		
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i], nc = c + dc[i];
			if (0 <= nr && nr < R && 0 <= nc && nc < C && !visited[(int) graph[nr][nc] - (int) 'A']) {
				recur(nr, nc);
			}
		}
		
		visited[(int) graph[r][c] - (int) 'A'] = false;
	}
	
}