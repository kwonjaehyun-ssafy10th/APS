import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	static int N;
	static int cnt;
	static int[][] graph;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		graph = new int[N][N];
		for (int r = 0; r < N; r++) {
			String str = br.readLine();
			for (int c = 0; c < N; c++) {
				graph[r][c] = Character.getNumericValue(str.charAt(c));
			}
		}
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			Arrays.fill(visited[i], false);
		}
		
		List<Integer> house = new ArrayList<>();
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				cnt = 0;
				if (dfs(r, c)) {
					house.add(cnt);
				}
			}
		}
		Collections.sort(house);
		
		bw.write(Integer.toString(house.size())); bw.newLine();
		for (int i = 0; i < house.size(); i++) {
			bw.write(Integer.toString(house.get(i))); bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static boolean dfs(int r, int c) {
		if (visited[r][c] || graph[r][c] == 0) return false;
		else {
			visited[r][c] = true;
			cnt++;
			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				if (0 <= nr && nr < N && 0 <= nc && nc < N && !visited[nr][nc]) dfs(nr, nc);
			}
		}
		return true;
	}

}