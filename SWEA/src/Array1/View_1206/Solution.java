package Array1.View_1206;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 0; t < 10; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			int[] dx = { -1, 1 };
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				int view = arr[i];
				for (int j = 0; j < 2; j++) {
					for (int k = 1; k <= 2; k++) {
						int nx = i + dx[j] * k;
						if (0 <= nx && nx < N) {
							view = Math.min(view, Math.max(0, arr[i] - arr[nx]));
						}
					}
				}
				cnt += view;
			}
			System.out.println(String.format("#%d %d", t + 1, cnt));
		}

		sc.close();

	}
}