package Array4.오목_판정_11315;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(input);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			char[][] map = new char[N][N];

			for (int r = 0; r < N; r++) {
				String line = sc.next();
				for (int c = 0; c < N; c++) {
					map[r][c] = line.charAt(c);
				}
			}

			String ans = "No";
			test: for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if ((char) map[r][c] != '.') {
//						System.out.println("r, c, char: " + r + " " + c + " " + (char)map[r][c]);
						boolean flagHori = true;
						boolean flagVert = true;
						boolean flagDiagL = true;
						boolean flagDiagR = true;
						int cntH = 1;
						int cntV = 1;
						int cntL = 1;
						int cntR = 1;
						for (int k = 1; k < 5; k++) {
							if (flagHori) {
								int ncH = c + k;
								if (ncH < N) {
									if ((char) map[r][ncH] == '.') {
										flagHori = false;
									} else
										cntH++;
								}
								if (cntH == 5) {
									ans = "YES";
									break test;
								}
							}

							if (flagVert) {
								int nrV = r + k;
								if (nrV < N) {
									if ((char) map[nrV][c] == '.') {
										flagVert = false;
									} else
										cntV++;
								}
								if (cntV == 5) {
									ans = "YES";
									break test;
								}
							}

							if (flagDiagL) {
								int nrL = r + k;
								int ncL = c - k;
								if (nrL < N && 0 <= ncL) {
									if ((char) map[nrL][ncL] == '.') {
										flagDiagL = false;
									} else
										cntL++;
								}
								if (cntL == 5) {
									ans = "YES";
									break test;
								}
							}

							if (flagDiagR) {
								int nrR = r + k;
								int ncR = c + k;
								if (nrR < N && ncR < N) {
									if ((char) map[nrR][ncR] == '.') {
										flagDiagR = false;
									} else
										cntR++;
								}
								if (cntR == 5) {
									ans = "YES";
									break test;
								}
							}

						}
					}
				}

			}
			System.out.printf("#%d %s\n", t, ans);
		}
		sc.close();
	}

	public static String input = "4\r\n" + "5\r\n" + "....o\r\n" + "...o.\r\n" + "..o..\r\n" + ".o...\r\n" + "o....\r\n"
			+ "5\r\n" + "...o.\r\n" + "ooooo\r\n" + "...o.\r\n" + "...o.\r\n" + ".....\r\n" + "5\r\n" + ".o.oo\r\n"
			+ "oo.oo\r\n" + ".oo..\r\n" + ".o...\r\n" + ".o...\r\n" + "5\r\n" + ".o.o.\r\n" + "o.o.o\r\n" + ".o.o.\r\n"
			+ "o.o.o\r\n" + ".o.o.";
}
