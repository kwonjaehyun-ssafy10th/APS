package Array1.최대수_구하기_2068;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int max = -1;
			for (int j = 0; j < 10; j++) {
				max = Math.max(max, sc.nextInt());
			}
			System.out.println(String.format("#%d %d", i + 1, max));
		}
	}

}