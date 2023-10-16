import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] graph = new int[N][N];
		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < N; j++) {
				if (line.charAt(j) == 'Y') graph[i][j] = 1;
				else graph[i][j] = 0;
			}
		}
		
		for (int k = 0; k < N; k++) {
			for (int a = 0; a < N; a++) {
				for (int b = 0; b < N; b++) {
					if (a != b) {
						if (graph[a][k] != 0 && graph[k][b] != 0) {
							if (graph[a][b] == 0) graph[a][b] = graph[a][k] + graph[k][b];
							else graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
						}
					}
				}
			}
		}
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				if (0 < graph[i][j] && graph[i][j] < 3) cnt++;
			}
			ans = Math.max(ans,  cnt);
		}
		System.out.println(ans);
		
		
		sc.close();
	}

}