import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[][][] graph = new int[2][N][M];
		for (int i = 0; i < 2; i++) {
			for (int n = 0; n < N; n++) {
				for (int m = 0; m < M; m++) {
					graph[i][n][m] = sc.nextInt();
				}
			}
		}
		for (int n = 0; n < N; n++) {
			for (int m = 0; m < M; m++) {
				System.out.print(graph[0][n][m] + graph[1][n][m] + " ");
			}
			System.out.println();
		}

		
		sc.close();
	}

}