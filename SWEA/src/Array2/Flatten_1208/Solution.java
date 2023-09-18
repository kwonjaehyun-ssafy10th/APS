package Array2.Flatten_1208;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {
			int dump = sc.nextInt();
			int[] cnt = new int[101];
			Arrays.fill(cnt, 0);
			for (int i = 0; i < 100; i++) {
				cnt[sc.nextInt()]++;
			}

			int lowest = 1;
			int highest = 100;
			int diff = highest - lowest;

			while (cnt[lowest] == 0 && lowest < 99) {
				lowest++;
			}
			while (cnt[highest] == 0 && highest > 1) {
				highest--;
			}

			while (dump > 0 && diff > 1) {
				cnt[highest]--;
				cnt[highest - 1]++;
				cnt[lowest]--;
				cnt[lowest + 1]++;
				dump--;
				while (cnt[lowest] == 0 && lowest < 99) {
					lowest++;
				}
				while (cnt[highest] == 0 && highest > 1) {
					highest--;
				}
				diff = highest - lowest;
			}

			System.out.println(String.format("#%d %d", t, diff));

		}

		sc.close();
	}

}