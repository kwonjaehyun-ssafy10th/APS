import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int N, M, ans;
	static int[][] graph;
	static boolean[][] visited;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new int[N][M];
		for (int n = 0; n < N; n++) {
			String str = br.readLine();
			for (int m = 0; m < M; m++) {
				graph[n][m] = Character.getNumericValue(str.charAt(m));
			}
		}
		visited = new boolean[N][M];
		bfs(0, 0);
		bw.write(Integer.toString(graph[N - 1][M - 1]));
		
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void bfs(int r, int c) {
		
		Queue<Integer[]> queue = new LinkedList<>();
		queue.add(new Integer[] {r, c});
		while (!queue.isEmpty()) {
			Integer[] rc = queue.poll();
			r = rc[0];
			c = rc[1];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (0 <= nr && nr < N && 0 <= nc && nc < M && !visited[nr][nc] && graph[nr][nc] == 1) {
					graph[nr][nc] = graph[r][c] + 1;
					visited[nr][nc] = true;
					queue.add(new Integer[] {nr, nc});
				}
				
			}
			
		}
		
	}

}