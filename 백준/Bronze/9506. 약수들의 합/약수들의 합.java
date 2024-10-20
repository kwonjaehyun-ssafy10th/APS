import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			if (n == -1) break;
			int i = 1;
			List<Integer> a = new ArrayList<>(), b = new ArrayList<>();
			while (i < n / 2 + 1) {
				if (n % i == 0 && !b.contains(i)) {
					a.add(i);
					int q = n / i;
					if (i != q) b.add(0, q);
				}
				i++;
			}
			b.remove(b.size() - 1);
			
			int sum = 0;
			for (int m: a) sum += m;
			for (int m: b) sum += m;
			if (sum == n) {
				System.out.print(n + " = ");
				System.out.print(a.stream().map(String::valueOf).collect(Collectors.joining(" + ")));
				System.out.println(" + " + b.stream().map(String::valueOf).collect(Collectors.joining(" + ")));
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
		
		sc.close();
	}

}