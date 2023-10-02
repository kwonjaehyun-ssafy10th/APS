import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] graph = new int[N][N];
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				graph[r][c] = sc.nextInt();
			}
		}
		
		for (int k = 0; k < N; k++) {
			for (int a = 0; a < N; a++) {
				for (int b = 0; b < N; b++) {
					if (graph[a][k] == 1 && graph[k][b] == 1) {
						graph[a][b] = 1;
					}
				}
			}
		}
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				System.out.print(graph[r][c] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}