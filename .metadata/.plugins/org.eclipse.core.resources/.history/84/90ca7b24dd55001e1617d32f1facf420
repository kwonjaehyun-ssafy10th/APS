package String.초심자의_회문_검사_1989;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			String word = sc.next();
			int N = word.length();
			int isPalindrome = 1;
			for (int i = 0; i < N / 2; i ++) {
				if (word.charAt(i) != word.charAt(N - 1 - i)) {
					isPalindrome = 0;
					break;
				}
			}
			System.out.println(String.format("#%d %d", t, isPalindrome));
		}
		
	}
	
	public static String input = "3\r\n" + 
			"level\r\n" + 
			"samsung\r\n" + 
			"eye";
	
}
