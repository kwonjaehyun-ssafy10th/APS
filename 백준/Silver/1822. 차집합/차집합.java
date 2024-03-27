import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int A = sc.nextInt(), B = sc.nextInt();
		List<Integer> a = new ArrayList<>(), c = new ArrayList<>();
		Set<Integer> b = new HashSet<>();
		for (int i = 0; i < A; i++) {
			a.add(sc.nextInt());
		}
		for (int i = 0; i < B; i++) {
			b.add(sc.nextInt());
		}
		for (int num: a) {
			if (!b.contains(num)) {
				c.add(num);
			}
		}
		c.sort(null);;
		System.out.println(c.size());
		for (int i = 0; i < c.size(); i++) {
			sb.append(c.get(i)).append(" ");
		}
		System.out.println(sb);
		
		sc.close();
	}

}