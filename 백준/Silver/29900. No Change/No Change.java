import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int target = 1;
		for (int m: list) {
			if (m <= target) target += m;
			else break;
		}
		System.out.println(target);
		
		sc.close();
	}

}