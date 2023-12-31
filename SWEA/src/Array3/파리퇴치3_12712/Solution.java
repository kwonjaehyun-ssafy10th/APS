package Array3.파리퇴치3_12712;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] dxT = { -1, 0, 1, 0 };
		int[] dyT = { 0, -1, 0, 1 };
		int[] dxX = { -1, 1, 1, -1 };
		int[] dyX = { -1, -1, 1, 1 };

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int ans = 0;
			int[][] map = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int cntT = map[i][j];
					int cntX = map[i][j];
					for (int k = 1; k < M; k++) {
						for (int d = 0; d < 4; d++) {
							int nxT = i + k * dxT[d];
							int nyT = j + k * dyT[d];
							int nxX = i + k * dxX[d];
							int nyX = j + k * dyX[d];
							if (0 <= nxT && nxT < N && 0 <= nyT && nyT < N) {
								cntT += map[nxT][nyT];
							}
							if (0 <= nxX && nxX < N && 0 <= nyX && nyX < N) {
								cntX += map[nxX][nyX];

							}
						}
					}

					ans = Math.max(ans, Math.max(cntT, cntX));
				}
			}

			System.out.printf("#%d %d\n", t + 1, ans);

		}

		sc.close();
	}

}