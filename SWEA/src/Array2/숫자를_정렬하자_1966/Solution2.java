package Array2.숫자를_정렬하자_1966;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Solution2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(
				new File("C:\\Users\\SSAFY\\Desktop\\APS\\SWEA\\src\\Array2\\숫자를_정렬하자_1966\\input.txt"));
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int max = 0;
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				max = Math.max(max, arr[i]);
			}

			int[] cnt = new int[max + 1];
			for (int i = 0; i < N; i++) {
				cnt[arr[i]]++;
			}

			for (int i = 1; i < max + 1; i++) {
				cnt[i] += cnt[i - 1];
			}

			int[] sArr = new int[N];
			for (int i = 0; i < N; i++) {
				sArr[--cnt[arr[N - 1 - i]]] = arr[N - 1 - i];
			}

			System.out.printf("#%d", t + 1);
			for (int i = 0; i < N; i++) {
				System.out.printf(" %d", sArr[i]);
			}
			System.out.println();

		}

		sc.close();

	}

}