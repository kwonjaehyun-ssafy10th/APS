package Stack.쇠막대기_자르기_5432;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 미완
public class Solution {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			List<Integer> list = new ArrayList<>();
			int num = 0;
			int cnt = 0;
			String line = sc.next();
			int[] arr = new int[line.length() + 1];
			for (int i = 1; i < line.length() + 1; i++) {
//				System.out.println("i: " + i);
				char c = line.charAt(i - 1);
//				System.out.println("c: " + c);
				if (c == '(') {
					arr[i] = ++num;
				} else {
					arr[i] = --num;
				}
//				System.out.println(Arrays.toString(arr));
				if (i > 1) {
					if (arr[i] - arr[i - 1] == 1 && arr[i - 1] - arr[i - 2] == 1) {
						list.add(0);
					}
					else if (arr[i - 1] - arr[i - 2] == 1 && arr[i - 1] - arr[i] == 1) {
//						System.out.println("i7 flag");
						List<Integer> newList = new ArrayList<>();
						for (int laser: list) {
							newList.add(++laser);
						}
						list = newList;
//						System.out.println(list);
					}
					else if (arr[i - 1] - arr[i] == 1 && arr[i - 2] - arr[i - 1] == 1) {
						cnt += list.get(list.size() - 1) + 1;
						list.remove(list.size() - 1);
					}
				}
//				System.out.println(list);
//				System.out.println("cnt: " + cnt);
			}
			System.out.println(String.format("#%d %d", t, cnt));
		}
		
		sc.close();
	}
	
	public static String input = "2\r\n" + 
			"()(((()())(())()))(())\r\n" + 
			"(((()(()()))(())()))(()())";

}
