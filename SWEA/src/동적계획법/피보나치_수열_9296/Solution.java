package 동적계획법.피보나치_수열_9296;

import java.util.Scanner;

public class Solution {

	static int[] res;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 5;
		int[] arr = new int[N];
		int max = 0;
		for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
			if (max < arr[n]) max = arr[n];
		}
		
		res = new int[max + 1];
		
		for (int n = 0; n < N; n++) {
			System.out.println(fibo(arr[n]));
		}
		
		sc.close();
	}
	
	static int fibo(int n) {
		if (n < 2) return n;
		if (res[n] == 0) res[n] = fibo(n - 2) + fibo(n - 1);
		return res[n];
	}

}
