import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt(), K = sc.nextInt();
		int f = (int) (K / 1.618);
		int c = 0;
		List<Integer> dp;
		while (true) {
			boolean flag = true;
			f -= c;
			dp = new ArrayList<>();
			dp.add(K);
			dp.add(f);
			for (int i = 0; i < D - 2; i++) {
				dp.add(dp.get(i) - dp.get(i + 1));
				if (dp.get(i + 1) < dp.get(i + 2)) {
					flag = false;
					break;
				}
			}
			if (flag) break;
			if (0 < c) c++;
			else c--;
			c = -c;
		}
		System.out.println(dp.get(D - 1));
		System.out.println(dp.get(D - 2));
		
		sc.close();
	}

}