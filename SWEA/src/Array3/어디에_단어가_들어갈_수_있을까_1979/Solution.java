package Array3.어디에_단어가_들어갈_수_있을까_1979;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] map = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			int ans = 0;
			for (int i = 0; i < N; i++) {
				int j = 0;
				int cntRow = 0;
				int cntCol = 0;
				while (j < N) {
					if (map[i][j] == 1) {
						cntRow++;
					} else {
						if (cntRow == K) {
							ans++;
						}
						cntRow = 0;
					}

					if (map[j][i] == 1) {
						cntCol++;
					} else {
						if (cntCol == K) {
							ans++;
						}
						cntCol = 0;
					}
					j++;
				}
				if (cntRow == K) {
					ans++;
				}
				if (cntCol == K) {
					ans++;
				}
			}

			System.out.printf("#%d %d\n", t + 1, ans);

		}

		sc.close();

	}

}