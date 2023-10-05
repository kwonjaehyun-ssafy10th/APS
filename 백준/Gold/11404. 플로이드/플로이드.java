import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] graph = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if (graph[a][b] == 0) graph[a][b] = c;
			else graph[a][b] = Math.min(graph[a][b], c);
		}
		
		for (int k = 1; k <= n; k++) {
			for (int a = 1; a <= n; a++) {
				for (int b = 1; b <= n; b++) {
					if (a == b) continue;
					if (graph[a][b] != 0 && graph[a][k] != 0 && graph[k][b] != 0) {
						graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
					} else if (graph[a][b] == 0 && graph[a][k] != 0 && graph[k][b] != 0) {
						graph[a][b] = graph[a][k] + graph[k][b];
					}
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}