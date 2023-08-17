package Stack1.제로_8931;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		int TC = sc.nextInt();
		for (int t = 1; t <= TC; t++) {
			Stack<Integer> st = new Stack<>();
			int K = sc.nextInt();
			for (int k = 0; k < K; k++) {
				int num = sc.nextInt();
				if (num == 0) st.pop();
				else st.push(num);
			}
			int sum = 0;
			while (!st.isEmpty()) sum += st.pop();
			System.out.println(String.format("#%d %d", t, sum));
		}
		
		sc.close();
	}
	
	public static String input = "2\r\n" + 
			"6\r\n" + 
			"10000\r\n" + 
			"10000\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"100000\r\n" + 
			"0\r\n" + 
			"10\r\n" + 
			"1\r\n" + 
			"3\r\n" + 
			"5\r\n" + 
			"4\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"7\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"6";

}
