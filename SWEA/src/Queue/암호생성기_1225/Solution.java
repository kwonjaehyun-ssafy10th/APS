package Queue.암호생성기_1225;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int t = sc.nextInt();
			int len = 8;
			int[] queue = new int[len];
			for (int i = 0; i < len; i++) {
				queue[i] = sc.nextInt();
			}
			int decrease = 1;
			int i = 0;
			while(true) {
				if (decrease == 6) decrease = 1;
				queue[i % len] -= decrease++;
				if (queue[i % len] <= 0) {
					queue[i % len] = 0;
					i++;
					break;
				}
				i++;
			}
			System.out.printf("#%d ", t);
			for (int j = 0; j < len; j++) {
				System.out.printf("%d ", queue[(i + j) % len]);
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}