package 피보나치_함수_1003;

import java.util.Scanner;

public class Main {
	
	static int[][] res = new int[41][2];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int[] ans = fibo(sc.nextInt());
			System.out.println(String.format("%d %d", ans[0], ans[1]));
		}
		
		sc.close();
	}
	
	static int[] fibo(int n) {
		if (n == 0) return new int[] {1, 0};
		if (n == 1) return new int[] {0, 1};
		if (res[n][0] == 0 && res[n][1] == 0) {
			int[] a = fibo(n - 2);
			int[] b = fibo(n - 1);
			res[n][0] = a[0] + b[0];
			res[n][1] = a[1] + b[1];
		}
		return res[n];
	}

}

// 1트 성공, 67270585, 232, 635