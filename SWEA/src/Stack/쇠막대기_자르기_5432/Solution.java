package Stack.쇠막대기_자르기_5432;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			Stack<Character> st = new Stack<>();
			Stack<Integer> idx = new Stack<>();
			int cnt = 0;
			char prev = '(';
			List<int[]> rod = new ArrayList<>();
			List<Integer> laser = new ArrayList<>();
			String line = sc.next();
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c == '(') {
					st.push(c);
					idx.push(i);
				} else {
					if (prev == '(') {
						laser.add(i);
						idx.pop();
					}
					else {
						int[] arr = {idx.pop(), i};
						rod.add(arr);
					}
					st.pop();
				}
				prev = c;
			}
			for (int[] r: rod) {
				System.out.println(Arrays.toString(r));
				int num = 0;
				for (int i: laser) {
					if (r[0] < i && i < r[1]) {
//						System.out.println(i);
						num++;
//						System.out.println("num: " + num);
					}
				}
				cnt += ++num;
//				System.out.println(String.format("cnt: %d", cnt));
			}
//			System.out.println(rod);
			System.out.println(laser);
		
			System.out.println(String.format("#%d %d", t, cnt));
		}
		
		sc.close();
	}
	
	public static String input = "2\r\n" + 
			"()(((()())(())()))(())\r\n" + 
			"(((()(()()))(())()))(()())";

}
