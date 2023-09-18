package Stack2.계산기3_1224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);

		List<Character> speChar = new ArrayList<>(Arrays.asList('(', '+', '*'));
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('(', 0);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 2);
		priority.put(')', 3);

		int T = 10;
		for (int t = 1; t <= T; t++) {
			Stack<Character> op = new Stack<>();
			String post = "";
			int len = sc.nextInt();
			String in = sc.next();
			for (int i = 0; i < len; i++) {
				char c = in.charAt(i);
				if (speChar.contains(c)) {
					if (c == '(') {
						op.push(c);
					} else {
						if (!op.isEmpty() && priority.get(c) > priority.get(op.peek()))
							op.push(c);
						else {
							while (!op.isEmpty() && priority.get(c) <= priority.get(op.peek())) {
								post += op.pop();
							}
							op.push(c);
						}
					}
				} else if (c == ')') {
					while (!op.isEmpty() && op.peek() != '(') {
						post += op.pop();
					}
					if (!op.isEmpty() && op.peek() == '(')
						op.pop();
				} else {
					post += c;
				}
			}

			Stack<Integer> num = new Stack<>();
			for (int i = 0; i < post.length(); i++) {
				char c = post.charAt(i);
				if (c == '+' || c == '*') {
					int b = num.pop();
					int a = num.pop();
					int res = 0;
					if (c == '+') {
						res = a + b;
					} else {
						res = a * b;
					}
					num.push(res);
				} else {
					num.push(c - '0');
				}
			}
			System.out.println(String.format("#%d %d", t, num.pop()));

		}

		sc.close();
	}

	public static String input = "113\r\n"
			+ "(9+(5*2+1)+(3*3*7*6*9*1*7+1+8*6+6*1*1*5*2)*4*7+4*3*8*2*6+(7*8*4*5)+3+7+(2+6+5+1+7+6+7*3*(6+2)+6+6)*2+4+2*2+4*9*3)\r\n"
			+ "85\r\n" + "(4+8+4*(8*5*(7*(6*8)+3+(6+(3+7+1*7*5*4)*3)*2*3+5)+6+7*7)*4+2+9*4+7+2*3*(7*6*1*8)+9+9)\r\n"
			+ "97\r\n"
			+ "(9*5+7+8+6+3+9*2+1+7+4+3+9*3*1+4*(4+4*3*1+9*3+(9*5)*1*7*8+2+8+8*7+9*4*9)+(1+1*8+8*9*7+1*4*5*2*5))\r\n"
			+ "89\r\n" + "((3*1*4+6*3+8+4+5+4+2*1+5+3*4)*1+1+(3*2*2+9+5*4*6*9+9+4+1*8+9)*4*8+9+3*7+9*6*9*5+8+3*8+1)\r\n"
			+ "125\r\n"
			+ "(2+(6*5+6+5+3*9+6+2+8*2+2)+6+2*2+2*5*1*2+1*8+1*(4+7*5+8+9+7+3*8*5)+(2+9+5*4*4+1+3*9*6*4*5+(5*(3+4)*9+8+7+9*2)+7+7+2)+8+2+7+5)\r\n"
			+ "113\r\n"
			+ "(8+8*6+3*9*8*7*6*3+5*(7*6*6+3*5+2*4*9*3+5+2+1*4)*1*7+6*8+9+3+2+8*3+8*(2+6*9+2*2*7+8*1*2+9*3+1+5)*(5*8+4*1*2*4*2))\r\n"
			+ "115\r\n"
			+ "(7+9*2+6+5*7+1*7*(9+8+6)*1*2+7+5*9*6*3+4*8*9*6*1*3+7*1+2+5+1*4*9+6*4+7*1*2*4*2+3+((3*4+9+7*1+7+5+3*7*1*7+8*3*8)+7))\r\n"
			+ "99\r\n"
			+ "(9*4+(1+5*7*8+9+1+2)+5+(6*(7+4*5*2+4+8*4+7)+9)*1*3*1+1*2*8+3+(2+9*(1*5*9+7*1+1+7+3*2))+1+3*7*8+9*6)\r\n"
			+ "75\r\n" + "(2*2+((7+8*8*6+(6*6)*7+7*1)*5)*7+3+1*5+1*8*4+(9+6+(7*5+3+1*8*8*9+4+7+9)*3))\r\n" + "117\r\n"
			+ "(8+6*9+2*3+4+2+(6+9+3+7*5*1+2+2+2)*9+4+6*1+6*4+7+7*2+5+2*6*(8*9*8*6+4*2)*5+5*8*3+(6+1+3+3*8*1*2*1+5+6)+1+5+4*7*1*3+1)";

}
