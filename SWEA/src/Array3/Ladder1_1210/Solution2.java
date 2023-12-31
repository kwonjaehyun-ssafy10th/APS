package Array3.Ladder1_1210;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = 10;
		int N = 100;

		for (int t = 1; t <= T; t++) {
			sc.nextInt();
			int sj = 0;
			int[][] map = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
					if (map[i][j] == 2)
						sj = j;
				}
			}

			int i = N - 1;
			int j = sj;

			while (i >= 0) {
				if (j == 0) {
					if (map[i][j + 1] == 1) {
						while (true) {
							if (j == N - 1)
								break;
							if (map[i][j + 1] == 0)
								break;
							j++;
						}
					}
				} else if (j == N - 1) {
					if (map[i][j - 1] == 1) {
						while (true) {
							if (j == 0)
								break;
							if (map[i][j - 1] == 0)
								break;
							j--;
						}
					}
				} else {
					if (map[i][j + 1] == 1) {
						while (true) {
							if (j == N - 1)
								break;
							if (map[i][j + 1] == 0)
								break;
							j++;
						}
					} else if (map[i][j - 1] == 1) {
						while (true) {
							if (j == 0)
								break;
							if (map[i][j - 1] == 0)
								break;
							j--;
						}
					}
				}
				i--;
			}
			System.out.printf("#%d %d\n", t, j);
		}

		sc.close();
	}
}