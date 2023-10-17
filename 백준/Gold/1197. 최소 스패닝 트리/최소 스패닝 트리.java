import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int[] p;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt(), E = sc.nextInt();
		PriorityQueue<int[]> edges = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[2], b[2]);
            }
        });
		
		for (int e = 0; e < E; e++) {
			edges.add(new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt()});
		}
		
		p = new int[V + 1];
		for (int i = 1; i <= V; i++) {
			p[i] = i;
		}
		
		
		int cnt = 0, ans = 0;
		while (cnt < V - 1) {
			int[] edge = edges.poll();
			int A = edge[0], B = edge[1], C = edge[2];
			if (find(A) != find(B)) {
				union(find(A), find(B));
				ans += C;
				cnt += 1;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

	public static int find(int x) {
		if (x == p[x]) return x;
		return p[x] = find(p[x]);
	}
	
	public static void union(int x, int y) {
		int rep_x = find(x), rep_y = find(y);
		if (rep_x != rep_y) {
			p[Math.max(rep_x, rep_y)] = Math.min(rep_x,  rep_y);
		}
	}
}