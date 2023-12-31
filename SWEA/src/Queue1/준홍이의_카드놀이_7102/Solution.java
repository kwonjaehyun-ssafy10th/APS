package Queue1.준홍이의_카드놀이_7102;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt(), M = sc.nextInt();
			System.out.printf("#%d ", t);
			for (int i = Math.abs(N - M); i >= 0; i--) {
				System.out.printf("%d ", Math.max(N, M) + 1 - i);
			}
			System.out.println();

		}

		sc.close();
	}

}