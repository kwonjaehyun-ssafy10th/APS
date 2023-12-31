package Array2.숫자를_정렬하자_1966;

import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < N - 1; i++) {
				int cur = arr[i];
				int idx = i;
				for (int j = i + 1; j < N; j++) {
					if (arr[j] < cur) {
						cur = arr[j];
						idx = j;
					}
				}
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
			}
			System.out.printf("#%d", t + 1);
			for (int i = 0; i < N; i++) {
				System.out.printf(" %d", arr[i]);
			}
			System.out.println();

		}

		sc.close();

	}

}