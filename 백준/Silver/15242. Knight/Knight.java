import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dr = { -2, -2, -1, 1, 2, 2, 1, -1 };
		int[] dc = { -1, 1, 2, 2, 1, -1, -2, -2 };
		
		String start = sc.next();
		String end = sc.next();
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] vis = new boolean[8][8];
		int[] square = {start.charAt(1) - '1', start.charAt(0) - 'a', 0};
		queue.add(square);
		while (!queue.isEmpty()) {
			square = queue.poll();
			int r = square[0];
			int c = square[1];
			int n = square[2];
			if (r == end.charAt(1) - '1' && c == end.charAt(0) - 'a') {
				System.out.println(n);
				break;
			}
			vis[r][c] = true;
			for (int i = 0; i < 8; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				if (0 <= nr && nr < 8 && 0 <= nc && nc < 8 && !vis[nr][nc]) {
					queue.add(new int[] { nr, nc, n + 1 });
				}
			}
			
		}
		
		sc.close();
	}

}