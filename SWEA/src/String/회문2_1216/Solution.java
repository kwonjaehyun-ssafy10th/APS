package String.회문2_1216;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// 미완
public class Solution {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new File("C:\\Users\\SSAFY\\Desktop\\APS\\SWEA\\src\\String\\회문2_1216\\input.txt"));
//		Scanner sc = new Scanner(input);

		int T = 10;
		int N = 100;

		for (int t = 1; t <= T; t++) {
			sc.nextInt();
			char[][] map = new char[N][N];
			for (int r = 0; r < N; r++) {
				String line = sc.next();
				for (int c = 0; c < N; c++) {
					map[r][c] = line.charAt(c);
				}
//			System.out.println(Arrays.toString(map[r]));	
			}

			int longestH = 0;
			int longestV = 0;
//			boolean stopH = false;
//			boolean stopV = false;
			int ans = 0;
			int temp = 0;
			int[] arr = new int[4];
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					length: for (int i = N - 1; i > c; i--) {
						boolean flagH = true;
						boolean flagV = true;
						for (int j = 0; j < (i - c + 1) / 2; j++) {
							if (flagH) {
								if (map[r][c + j] != map[r][i - j]) {
									flagH = false;
								}
							}
							if (flagV) {
								if (map[c + j][r] != map[i - j][r]) {
									flagV = false;
								}
							}

							if (!flagH && !flagV)
								break;
						}
						if (flagH) {
							longestH = i - c + 1;
//							stopH = true;
							temp = longestH;
						}
						if (flagV) {
							longestV = i - c + 1;
//							stopV = true;
							temp = longestV;
						}
						if (flagH || flagV) {
							if (temp > ans) {
//								System.out.println("ans: " + ans + ", temp: " + temp);
//								System.out.println(String.format("(t, r, c, i, temp): (%d, %d, %d, %d, %d)", t, r, c, i, temp));
								ans = temp;

							}

							break length;
						}
					}

				}
			}
			System.out.println(String.format("#%d %d", t, ans));
//			break;
		}

		sc.close();
	}

	public static String input = "1\r\n" + "AABAA\r\n" + "ABCBB\r\n" + "ABABC\r\n" + "CCBBA\r\n" + "AABCA";

}
