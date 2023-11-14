import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static List<Deque<Integer>> gears;
	static boolean[] vis;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		gears = new ArrayList<Deque<Integer>>();
		for (int i = 0; i < 4; i++) {
			String line = sc.next();
			Deque<Integer> gear = new LinkedList<>();
			for (int j = 0; j < 8; j++) {
				gear.add(Integer.valueOf(line.charAt(j)) - 48);
			}
			gears.add(gear);
		}
		
		int K = sc.nextInt();
		for (int k = 0; k < K; k++) {
			vis = new boolean[4];
			int i = sc.nextInt(), dir = sc.nextInt();
			rotate(i - 1, dir);
		}
		int score = 0;
		for (int i = 0; i < 4; i++) {
			score += ((LinkedList<Integer>)gears.get(i)).get(0) * Math.pow(2, i);
		}
		
		System.out.println(score);
		
		sc.close();
	}
	
	static void rotate(int i, int dir) {
		vis[i] = true;
		int left = ((LinkedList<Integer>) gears.get(i)).get(6);
		int right = ((LinkedList<Integer>) gears.get(i)).get(2);
		if (dir == 1) {
			gears.get(i).addFirst(gears.get(i).pollLast());
		} else {
			gears.get(i).addLast(gears.get(i).pollFirst());
		}
		if (0 < i && !vis[i - 1] && left != ((LinkedList<Integer>) gears.get(i - 1)).get(2)) {
			rotate(i - 1, -dir);
		}
		if (i < 3 && !vis[i + 1] && right != ((LinkedList<Integer>) gears.get(i + 1)).get(6)) {
			rotate(i + 1, -dir);
		}
	}

}