import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Node {
	
	int num;
	boolean vis = false;
	List<Integer> adj = new ArrayList<>();
	int turn = 0;
	
	Node(int num) {
		this.num = num;
	}
}

public class Main {

	static int t = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
		Node[] nodes = new Node[N + 1];
		for (int n = 1; n <= N; n++) {
			nodes[n] = new Node(n);
		}
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
			nodes[u].adj.add(v);
			nodes[v].adj.add(u);
		}
		for (int n = 1; n <= N; n++) {
			nodes[n].adj.sort(null);
		}
		
		dfs(nodes, R);
		for (int n = 1; n <= N; n++) {
			bw.write(String.valueOf(nodes[n].turn));
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void dfs(Node[] nodes, int R) {
		nodes[R].turn = t++;
		nodes[R].vis = true;
		for (int n: nodes[R].adj) {
			if (!nodes[n].vis) {
				dfs(nodes, n);
			}
		}
	}
	
	

}