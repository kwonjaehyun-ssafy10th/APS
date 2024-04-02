import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	 Node(int idx) {
	 }
	 Node parent;
	 List<Node> children = new ArrayList<>(); 
}

public class Main {
	
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Node[] nodes = new Node[N];
		for (int n = 0; n < N; n++) {
			nodes[n] = new Node(n);
		}
		List<Node> roots = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			int a = sc.nextInt();
			if (a == -1) roots.add(nodes[n]);
			else {
				nodes[n].parent = nodes[a];
				nodes[a].children.add(nodes[n]);
			}
		}
		int target = sc.nextInt();
		if (nodes[target].parent == null) {
			roots.remove(nodes[target]);
		} else {
			nodes[target].parent.children.remove(nodes[target]);
		}
		for (Node root: roots) dfs(root);
		System.out.println(cnt);
		
		sc.close();
	}
	
	static void dfs(Node node) {
		if (node.children.size() == 0) cnt++;
		else {
			for (Node n: node.children) dfs(n);
		}
	}

}