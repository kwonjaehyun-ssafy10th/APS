import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt(), C = sc.nextInt();
		String[] map = new String[R];
		for (int r = 0; r < R; r++) {
			map[r] = sc.next();
		}
		boolean[] vis = new boolean[R];
		int cnt = 0;
		int rank = 1;
		int[] ans = new int[R];
		for (int c = 0; c < C; c++) {
			boolean flag = false;
			for (int r = 0; r < R; r++) {
				if (!vis[r]) {
					if (map[r].charAt(C - 2 - c) != '.') {
						ans[map[r].charAt(C - 2 - c) - '0' - 1] = rank;
						vis[r] = true;
						flag = true;
						cnt++;
					}
				}
			}
			if (flag) rank++;
			if (cnt == 9) break;
		}
		for (int i:ans) {
			if (i != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}