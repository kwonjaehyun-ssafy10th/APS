package Array1.Gravity_16504;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int w = sc.nextInt();
			int[] arr = new int[w];
			int max = 0;
			for (int j = 0; j < w; j++) {
				arr[j] = sc.nextInt();
			}
			for (int j = 0; j < w; j++) {
				int cnt = 0;
				int k = j + 1;
				while (k < w) {
					if (arr[j] <= arr[k]) {
						cnt++;
					}
					k++;
				}
				max = Math.max(max, w - j - cnt - 1);
			}
			System.out.println(String.format("#%d %d", i + 1, max));

		}
	}

}