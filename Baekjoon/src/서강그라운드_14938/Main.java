package 서강그라운드_14938;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt(), r = sc.nextInt();
		int[] t = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			t[i] = sc.nextInt();
		}
		int[][] graph = new int[n + 1][n + 1];
		for (int i = 0; i < r; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), l = sc.nextInt();
			graph[a][b] = graph[b][a] = l;
		}
		
		for (int k = 1; k <= n; k++) {
			for (int a = 1; a <= n; a++) {
				for (int b = 1; b <= n; b++) {
					if (a != b) {
						if (graph[a][k] != 0 && graph[k][b] != 0) {
							if (graph[a][b] == 0) {
								graph[a][b] = graph[a][k] + graph[k][b];
							} else {
								graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
							}
						}
					}
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i != j && graph[i][j] == 0) {
					graph[i][j] = graph[j][i] = 16;
				}
			}
		}
		
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				if (graph[i][j] <= m) {
					cnt += t[j];
				}
			}
			if (ans < cnt) ans = cnt;
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
