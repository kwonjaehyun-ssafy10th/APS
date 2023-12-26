import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int n = 1; n <= N; n++) {
			q.add(n);
		}
		while (1 < q.size()) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.peek());
		
		sc.close();
	}

}