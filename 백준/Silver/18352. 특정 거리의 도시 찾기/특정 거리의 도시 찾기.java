import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	
	static PriorityQueue<Integer> pq;
	static List<List<Integer>> graph;
	static boolean[] vis;
	static int N, M, K, X;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		graph = new ArrayList<>();
		for (int n = 0; n <= N; n++) {
			graph.add(new ArrayList<Integer>());
		}
		vis = new boolean[N + 1];
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			graph.get(A).add(B);
		}
		bfs(X);
		if (pq.size() == 0) System.out.println(-1);
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}		
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void bfs(int start) {
		Queue<Integer[]> queue = new LinkedList<>();
		pq = new PriorityQueue<Integer>();
		queue.add(new Integer[] {0, start});
		vis[start] = true;
		while (!queue.isEmpty()) {
			Integer[] a = queue.poll();
			int cost = a[0], node = a[1];
			if (cost == K) break;
			for (int n: graph.get(node)) {
				if (!vis[n]) {
					queue.add(new Integer[] {cost + 1, n});
					vis[n] = true;
					if (cost + 1 == K) {
						pq.add(n);
					}
				}		
			}			
		}
	}
	
}