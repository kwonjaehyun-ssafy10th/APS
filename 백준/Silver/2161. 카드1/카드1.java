import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for (int n = 1; n <= N; n++) {
			queue.add(n);
		}
		while(1 < queue.size()) {
			System.out.print(queue.poll() + " ");
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());
	}

}