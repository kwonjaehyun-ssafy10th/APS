import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[][] A = new int[N][M];
		for (int n = 0; n < N; n++) {
			for (int m = 0; m < M; m++) {
				A[n][m] = sc.nextInt();
			}
		}
		M = sc.nextInt();
		int K = sc.nextInt();
		int[][] B = new int[M][K];
		for (int m = 0; m < M; m++) {
			for (int k = 0; k < K; k++) {
				B[m][k] = sc.nextInt();
			}
		}
		int[][] C = new int[N][K];
		for (int n = 0; n < N; n++) {
			for (int k = 0; k < K; k++) {
				int a = 0;
				for (int m = 0; m < M; m++) {
					a += A[n][m] * B[m][k];
				}
				C[n][k] = a;
			}
		}
		for (int n = 0; n < N; n++) {
			for (int k = 0; k < K; k++) {
				System.out.print(String.format("%d ", C[n][k]));
			}
			System.out.println();
		}
		
		sc.close();
	}

}