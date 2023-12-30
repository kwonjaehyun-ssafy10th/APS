import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Integer[]> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add(new Integer[] {x, y});
		}
		for (int n = 0; n < N; n++) {
			int cnt = 0;
			int x = list.get(n)[0];
			int y = list.get(n)[1];
			for (int m = 0; m < N; m++) {
				if (n == m) continue;
				if (x < list.get(m)[0] && y < list.get(m)[1]) cnt++;
			}
			System.out.print(cnt + 1 + " ");
		}
		
		sc.close();
	}

}