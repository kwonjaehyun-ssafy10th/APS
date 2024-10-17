import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			List<Integer> dp = new ArrayList<>();
			dp.add(0);
			dp.add(1);
			int i = 2;
			while (true) {
				int m = dp.get(i - 2) + dp.get(i - 1);
				dp.add(m);
				if (n <= m) break;
				i++;
			}
			int sum = n;
			List<Integer> ans = new ArrayList<>();
			while (0 < sum) {
				int m = dp.get(i--);
				if (m <= sum) {
					ans.add(m);
					sum -= m;
				}
			}
			ans.sort(null);
			for (int m: ans) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}