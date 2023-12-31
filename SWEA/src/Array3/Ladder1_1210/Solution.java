package Array3.Ladder1_1210;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 0; t < 10; t++) {
			int N = 100;
			sc.nextInt();
			int[][] map = new int[N][N];
			int sj = 0;
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
				if (0 <= j - 1 && map[i][j - 1] == 1) {
					while (0 <= j - 1 && map[i][j - 1] == 1) {
						j--;
					}
					i--;
				} else if (j + 1 < N && map[i][j + 1] == 1) {
					while (j + 1 < N && map[i][j + 1] == 1) {
						j++;
					}
					i--;
				}
				if (i == -1)
					break;
				if (j == 0) {
					if (map[i][j + 1] == 1)
						break;
				} else if (j == N - 1) {
					if (map[i][j - 1] == 1)
						break;
				} else {
					if (map[i][j - 1] == 1 || map[i][j - 1] == 1)
						break;
				}
				i--;
				System.out.println(i + " " + j);
			}

			System.out.printf("#%d %d\n", t + 1, j);
		}

		sc.close();

	}
}
