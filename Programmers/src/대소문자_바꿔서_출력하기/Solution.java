package 대소문자_바꿔서_출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
        	char c = a.charAt(i);
        	if (Character.isUpperCase(c)) sb.append(Character.toString(c).toLowerCase());
        	else sb.append(Character.toString(c).toUpperCase());
        }
        System.out.println(sb);
    }
}