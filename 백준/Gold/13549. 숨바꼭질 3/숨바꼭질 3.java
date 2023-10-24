import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAX = 100001;
		
		int N = sc.nextInt(), K = sc.nextInt();
		int[] vis = new int[100001];
		Arrays.fill(vis,  -1);
		Queue<Integer> q = new LinkedList<>();
		q.add(N);
		vis[N] = 0;
		while (!q.isEmpty()) {
			int n = q.poll();
			if (n == K) {
				System.out.println(vis[n]);
				break;
			}
			
			if (0 <= 2 * n && 2 * n < MAX && vis[2 * n] == -1) {
				vis[2 * n] = vis[n];
				q.add(2 * n);
			}
			if (0 <= n - 1 && n - 1 < MAX && vis[n - 1] == -1) {
				vis[n - 1] = vis[n] + 1;
				q.add(n - 1);
			}
			if (0 <= n + 1 && n + 1 < MAX && vis[n + 1] == -1) {
				vis[n + 1] = vis[n] + 1;
				q.add(n + 1);
			}
		}
		
	}

}