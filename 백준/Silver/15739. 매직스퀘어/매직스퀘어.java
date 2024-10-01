import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean[] vis = new boolean[N * N];
		boolean flag = true;
		int sum = N * (N * N + 1) / 2;
		int[][] matrix = new int[N][N];
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				int num = sc.nextInt();
				if (vis[num - 1]) {
					flag = false;
					break;
				} else {
					vis[num - 1] = true;
				}
				matrix[r][c] = num;
			}
		}
		if (flag) {
			int diag1 = 0;
			int diag2 = 0;
			for (int r = 0; r < N; r++) {
				int hor = 0;
				int ver = 0;
				for (int c = 0; c < N; c++) {
					hor += matrix[r][c];
					ver += matrix[c][r];
					if (r == c) {
						diag1 += matrix[r][c];
						diag2 += matrix[r][N - c - 1];
					}
				}
				if (hor != sum || ver != sum) {
					flag = false;
					break;
				}
			}
			if (diag1 != sum || diag2 != sum) flag = false;
		}
		String ans = "FALSE";
		if (flag) ans = "TRUE";
		System.out.println(ans);
		
		sc.close();
	}

}