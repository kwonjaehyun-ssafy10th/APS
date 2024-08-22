import java.util.Scanner;

public class Main {

	static int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1 };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int R = sc.nextInt(), C = sc.nextInt();
			if (R == 0 && C == 0) break;
			String[] map = new String[R];
			for (int r = 0; r < R; r++) {
				map[r] = sc.next();
			}
			String[] ans = new String[R];
			for (int r = 0; r < R; r++) {
				String temp = "";
				for (int c = 0; c < C; c++) {
					if (map[r].charAt(c) == '.') {
						int cnt = 0;
						for (int i = 0; i < 8; i++) {
							int nr = r + dr[i];
							int nc = c + dc[i];
							if (0 <= nr && nr < R && 0 <= nc && nc < C) {
								if (map[nr].charAt(nc) == '*') cnt++;
							}
						}
						temp += cnt + "";
					} else {
						temp += '*';
					}
				}
				ans[r] = temp;
			}
			for (String row:ans) System.out.println(row);
		}
		
		sc.close();
	}

}