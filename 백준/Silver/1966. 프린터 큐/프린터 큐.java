import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				int n = sc.nextInt();
				pq.add(n);
				list.add(n);
			}
			int idx = M;
			int ans = 0;
			outer: for (int i = 0; i < N; i++) {
				int max = pq.poll();
				while (true) {
					int cur = list.remove(0);
					if (cur < max) {
						list.add(cur);
					} else {
						ans++;
						if (idx == 0) {
							System.out.println(ans);
							break outer;
						}
						idx--;
						if (idx == -1) idx = list.size() - 1;
						break;
					}
					idx--;
					if (idx == -1) idx = list.size() - 1;
				}
			}
		}
				
		sc.close();
	}

}