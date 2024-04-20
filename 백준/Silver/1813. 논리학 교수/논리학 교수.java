import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] cnt = new int[51];
		for (int n = 0; n < N; n++) {
			int i = sc.nextInt();
			cnt[i]++;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 50; i++) {
			if (i == cnt[i]) list.add(i);
		}
		if (list.size() == 0) {
			if (0 < cnt[0]) System.out.println(-1);
			else System.out.println(0);
		} else {
			list.sort(null);
			System.out.println(list.get(list.size() - 1));
		}
		

		sc.close();
	}

}