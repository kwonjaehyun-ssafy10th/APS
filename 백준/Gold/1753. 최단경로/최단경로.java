import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static int V, E, K;
	static List<ArrayList<int[]>> edges;
	static int[] dist;
	static boolean[] vis;
	    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt(); E = sc.nextInt(); K = sc.nextInt();
		dist = new int[V + 1];
		vis = new boolean[V + 1];
		edges = new ArrayList<ArrayList<int[]>>();
		for (int v = 0; v < V + 1; v++) {
			edges.add(new ArrayList<int[]>());
		}
		for (int e = 0; e < E; e++) {
			int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
			edges.get(u).add(new int[] {w, v});
		}
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		dijik(K);
		for (int v = 1; v < V + 1; v++) {
			if (dist[v] < Integer.MAX_VALUE) {
				System.out.println(dist[v]);
			} else {
				System.out.println("INF");
			}
		}

		
		sc.close();
	}
	
	static void dijik(int k) {
		dist[k] = 0;
		vis[k] = true;
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[0], b[0]);
			}

		});
		for (int[] edge: edges.get(k)) {
			pq.add(edge);
		}
		
		while (!pq.isEmpty()) {
			int[] edge = pq.poll();
			vis[edge[1]] = true;
			int w = edge[0], v = edge[1];
			if (dist[v] < w) continue;
			dist[v] = w;
			for (int[] e: edges.get(v)) {
				if (!vis[e[1]]) {
					int next = e[1], cost = w + e[0];
					pq.add(new int[] { cost, next });
				}
			}
		}
		
	}

}