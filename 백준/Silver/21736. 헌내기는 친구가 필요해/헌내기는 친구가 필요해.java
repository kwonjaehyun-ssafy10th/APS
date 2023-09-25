import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static char[][] graph;
	static boolean[][] visited;
	static int cnt;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new char[N][M];
		int sr = 0;
		int sc = 0;
		for (int n = 0; n < N; n++) {
			graph[n] = br.readLine().toCharArray();
			for (int c = 0; c < M; c++) {
				if (graph[n][c] == 'I') {
					sr = n;
					sc = c;
				}
			}
		}
		visited = new boolean[N][M];
		
		dfs(sr, sc);
		
		if (cnt > 0) bw.write(Integer.toString(cnt));
		else bw.write("TT");
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void dfs(int r, int c) {
		if (graph[r][c] == 'O' || graph[r][c] == 'I' || graph[r][c] == 'P') {
			visited[r][c] = true;
			if (graph[r][c] == 'P') {
				cnt++;
			}
			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				if (0 <= nr && nr < N && 0 <= nc && nc < M && !visited[nr][nc]) {
					dfs(nr, nc);
				}
			}
		}
	}

}