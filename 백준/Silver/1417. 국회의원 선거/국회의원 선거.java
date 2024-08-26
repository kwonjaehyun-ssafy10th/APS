import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int N = sc.nextInt();
		int d = sc.nextInt();
		for (int n = 0; n < N - 1; n++) {
			int a = sc.nextInt();
			pq.add(a);
		}
		int cnt = 0;
		while (!pq.isEmpty()) {
			int a = pq.poll();
			if (a < d) break;
			d++;
			a--;
			pq.add(a);
			cnt++;			
		}
		System.out.println(cnt);
		
		sc.close();
	}

}