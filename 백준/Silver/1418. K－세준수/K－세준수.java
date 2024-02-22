import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		boolean[] check = new boolean[100001];
		Arrays.fill(check, true);
		check[0] = false;
		check[1] = false;
		for (int i = 2; i <= 100000; i++) {
			if (check[i]) {
				int j = 2;
				while (true) {
					if (100000 < i * j)
						break;
					check[i * j++] = false;
				}
			}
		}
		for (int n = 1; n <= N; n++) {
			List<Integer> list = new ArrayList<>();
			list.add(0);
			if (check[n])
				list.add(n);
			for (int i = 2; i < (int) Math.sqrt(n) + 1; i++) {
				if (n % i == 0 && check[n / i])
					list.add(n / i);
				if (check[i] && n % i == 0)
					list.add(i);
			}
			Collections.sort(list, Collections.reverseOrder());
			if (list.get(0) <= K) {
				cnt++;
			}
		}
		System.out.println(cnt);

		sc.close();
	}

}