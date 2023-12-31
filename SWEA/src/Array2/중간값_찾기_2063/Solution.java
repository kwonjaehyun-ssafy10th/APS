package Array2.중간값_찾기_2063;

import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < (N + 1) / 2; i++) {
			int cur = arr[i];
			int idx = i;
			for (int j = i + 1; j < N; j++) {
				if (arr[j] < cur) {
					idx = j;
					cur = arr[idx];
				}
			}
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
			ans = i;
		}
		System.out.println(arr[ans]);
	}
}