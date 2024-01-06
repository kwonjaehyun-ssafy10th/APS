import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		List<int[]> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add(new int[] {x, y});
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			public int compare(int[] p1, int[] p2) {
				int sx = Integer.compare(p1[0], p2[0]);
				if (sx != 0) {
					return sx;
				} else {
					return Integer.compare(p1[1], p2[1]);
				}
			}
		});
		
		for (int[] p: list) {
			sb.append(p[0]);
			sb.append(" ");
			sb.append(p[1]);
			sb.append("\n");
		}
		System.out.println(sb);
		
		sc.close();
	}

}