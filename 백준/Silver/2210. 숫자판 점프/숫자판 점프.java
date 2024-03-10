import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static String[][] graph;
	static List<String> list;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 }; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		graph = new String[5][5];
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				graph[r][c] = sc.next();
			}
		}
		list = new ArrayList<String>();
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				dfs(r, c, 0, "");
			}
		}
		System.out.println(list.size());
		
		sc.close();
	}
	
	static void dfs(int r, int c, int i, String num) {
		num += graph[r][c];
		if (i == 5) {
			if (!list.contains(num)) {
				list.add(num);
			}
			return;
		}
		for (int j = 0; j < 4; j++) {
			int nr = r + dr[j];
			int nc = c + dc[j];
			if (0 <= nr && nr < 5 && 0 <= nc && nc < 5) {
				dfs(nr, nc, i + 1, num);
			}
		}
	}

}