import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int m = list.get(2);
		while (true) {
			int cnt = 0;
			for (int n: list) {
				if (m % n == 0) cnt++;
			}
			if (2 < cnt) break;
			m++;
		}
		System.out.println(m);
		
		sc.close();
	}

}