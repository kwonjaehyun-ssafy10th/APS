package Stack1.쇠막대기_자르기_5432;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(input);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			Stack<Character> st = new Stack<>();
			int cnt = 0;
			char prev = '(';
			String line = sc.next();
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c == '(') {
					st.push(c);
				} else {
					st.pop();
					if (prev == '(') {
						cnt += st.size();
					} else
						cnt++;
				}
				prev = c;

			}

			System.out.println(String.format("#%d %d", t, cnt));
		}

		sc.close();
	}

	public static String input = "2\r\n" + "()(((()())(())()))(())\r\n" + "(((()(()()))(())()))(()())";

}
