package Queue.암호생성기_1225;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
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
//				System.out.println(String.format("decrease: %d", decrease));
				if (decrease == 6) decrease = 1;
				queue[i % len] -= decrease++;
				if (queue[i % len] <= 0) {
					queue[i % len] = 0;
					i++;
//					System.out.println(String.format("i: %d", i % len));
//					System.out.println(Arrays.toString(queue));
					break;
				}
//				System.out.println(String.format("i: %d", i % len));
//				System.out.println(Arrays.toString(queue));
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
	
	public static String input = "1\r\n" + 
			"9550 9556 9550 9553 9558 9551 9551 9551 \r\n" + 
			"2\r\n" + 
			"2419 2418 2423 2415 2422 2419 2420 2415 \r\n" + 
			"3\r\n" + 
			"7834 7840 7840 7835 7841 7835 7835 7838 \r\n" + 
			"4\r\n" + 
			"4088 4087 4090 4089 4093 4085 4090 4084 \r\n" + 
			"5\r\n" + 
			"2945 2946 2950 2948 2942 2943 2948 2947 \r\n" + 
			"6\r\n" + 
			"670 667 669 671 670 670 668 671 \r\n" + 
			"7\r\n" + 
			"8869 8869 8873 8875 8870 8872 8871 8873 \r\n" + 
			"8\r\n" + 
			"1709 1707 1712 1712 1714 1710 1706 1712 \r\n" + 
			"9\r\n" + 
			"10239 10248 10242 10240 10242 10242 10245 10235 \r\n" + 
			"10\r\n" + 
			"6580 6579 6574 6580 6583 6580 6577 6581 ";

}
