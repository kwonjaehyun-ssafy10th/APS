import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<>();
		int N = sc.nextInt();
		int K = sc.nextInt();
		for (int n = 1; n <= N; n++) {
			queue.add(n);
		}
		sb.append("<");
		int a = 0;
		outer: while (!queue.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				a = queue.poll();
				if (queue.isEmpty()) break outer;
				queue.add(a);
			}
			a = queue.poll();
			if (queue.isEmpty()) break;
			sb.append(a);
			sb.append(", ");
		}
		sb.append(a);
		sb.append(">");
		System.out.println(sb);
		
		sc.close();
	}

}