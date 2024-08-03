import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int a = sc.nextInt(), b = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			int n = 1;
			for (int i = 0; i < b; i++) {
				n *= a;
				n %= 10;
				if (list.contains(n)) break;
				list.add(n);
			}
			int idx = b % list.size();
			if (idx == 0) idx += list.size();
			idx--;
			int ans = list.get(idx);
			if (ans == 0) ans = 10;
			System.out.println(ans);
		}
		
		sc.close();
	}

}