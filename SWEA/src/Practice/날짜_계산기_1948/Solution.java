package Practice.날짜_계산기_1948;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] days = new int[13];
		for (int i = 1; i < 12; i++) {
			switch (i) {
				case 2:
					days[i + 1] = 28;
					break;
				case 4: case 6: case 9: case 11:
					days[i + 1] = 30;
					break;
				default:
					days[i + 1] = 31;
			}
		}
		
		for (int i = 2; i < 13; i++) {
			days[i] += days[i - 1];
		}
		
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
			sb.append("#").append(t).append(" ").append(days[m2] + d2 - (days[m1] + d1) + 1).append("\n");
		}
		System.out.println(sb);
		
		sc.close();
	}

}
