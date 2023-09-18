package Array2.최빈수_구하기_1204;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			sc.next();
			int[] cnt = new int[101];
			Arrays.fill(cnt, 0);
			for (int i = 0; i < 1000; i++) {
				cnt[sc.nextInt()]++;
			}
			int mode = 0;
			for (int i = 1; i < 101; i++) {
				if (cnt[mode] <= cnt[i]) {
					mode = i;
				}
			}
			System.out.println(String.format("#%d %d", t, mode));
		}

		sc.close();

	}

}