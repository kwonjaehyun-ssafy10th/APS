import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt(), H = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> row = new ArrayList<>(), col = new ArrayList<>();
		row.add(H);
		col.add(W);
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt(), idx = sc.nextInt();
			if (d == 0) {
				row.add(idx);
			} else {
				col.add(idx);
			}
		}
		row.sort(null);
		col.sort(null);
		int ans = 0;
		int pr = 0;
		for (int i: row) {
			int pc = 0;
			for (int j: col) {
				int s = (i - pr) * (j - pc);
				if (ans < s) {
					ans = s;
				}
				pc = j;
			}
			pr = i;
		}
		System.out.println(ans);
		
		sc.close();
	}

}