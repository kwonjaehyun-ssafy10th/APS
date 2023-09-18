package Tree.사칙연산_1232;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			Node[] tree = new Node[N + 1];
			for (int n = 0; n < N; n++) {
				int idx = sc.nextInt();
				Node node = new Node(sc.next());
				tree[idx] = node;
				if (! Character.isDigit(node.data.charAt(0))) {
					node.left = sc.nextInt();
					node.right = sc.nextInt();
				}
			}
			inOrder(tree, tree[1]);
			float res = Float.parseFloat(tree[1].data);
			int ans = (int) res;
			System.out.println(String.format("#%d %d", t, ans));
		}
		
		sc.close();
	}
	
	public static void inOrder(Node[] tree, Node node) {
		Node leftChild = tree[node.left];
		if (! Character.isDigit(leftChild.data.charAt(0))) {
			inOrder(tree, leftChild);
		}
		Node rightChild = tree[node.right];
		if (! Character.isDigit(rightChild.data.charAt(0))) {
			inOrder(tree, rightChild);
		}
		
		float leftVal = Float.parseFloat(tree[node.left].data);
		float rightVal = Float.parseFloat(tree[node.right].data);
		switch (node.data) {
			case "+":
				node.data = leftVal + rightVal + "";
			case "-":
				node.data = leftVal - rightVal + "";
			case "*":
				node.data = leftVal * rightVal + "";
			case "/":
				node.data = leftVal / rightVal + "";
		}
		
	}

}

class Node {
	public String data;
	public int left;
	public int right;
	public Node() {}
	public Node(String data) {
		this.data = data;
	}
}