package 뱀과_사다리_게임_16928;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[101];
		for (int i = 1; i < 101; i++) {
			arr[i] = i;
		}
		boolean[] visited = new boolean[101];
		
		int N = sc.nextInt(), M = sc.nextInt();
		for (int i = 0; i < N + M; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			arr[x] = y;
		}		
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {1, 0});
		outer: while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			for (int i = 1; i < 7; i++) {
				if (arr[cur[0] + i] > 99) {
					System.out.println(cur[1] + 1);
					break outer;
				} else if (!visited[arr[cur[0]] + i]) {
					visited[arr[cur[0] + i]] = true;
					queue.add(new int[] {arr[cur[0] + i], cur[1] + 1});
				}
			}
		}
		
		
		sc.close();
	}

}
