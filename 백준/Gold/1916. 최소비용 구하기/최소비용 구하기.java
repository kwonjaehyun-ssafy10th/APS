import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static int[] c;
	static int A, B;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		c = new int[N + 1];
		Arrays.fill(c,  Integer.MAX_VALUE);
		
		List<ArrayList<int[]>> edges =  new ArrayList<>();

		for (int n = 0; n <= N; n++) {
			edges.add(new ArrayList<int[]>());			
		}
		
		for (int m = 0; m < M; m++) {
			int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
			edges.get(A).add(new int[] {C, B});
		}
		
		A = sc.nextInt(); B = sc.nextInt();
		dijik(A, edges);
		System.out.println(c[B]);

		sc.close();
	}
	
	public static void dijik(int A, List<ArrayList<int[]>> edges) {
		PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[0], b[0]);
			}
		});
		c[A] = 0;
		q.add(new int[] {0, A});
		while (!q.isEmpty()) {
			int[] edge = q.poll();
			int cost = edge[0], node = edge[1];
			if (c[node] < cost) continue;
			for (int[] e: edges.get(node)) {
				if (cost + e[0] < c[e[1]]) {
					c[e[1]] = cost + e[0];
					q.add(new int[] {c[e[1]], e[1]});
				}
			}
			
		}
	}

}