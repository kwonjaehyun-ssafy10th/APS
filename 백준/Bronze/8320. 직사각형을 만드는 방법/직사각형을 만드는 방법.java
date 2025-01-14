import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Set<Integer[]> set = new HashSet<>();
		int ans = 0;
		for (int i = 1; i < (int) Math.sqrt(n) + 1; i++) {
			for (int j = i; j < n + 1; j++) {
				if (i * j <= n) {
					Integer[] p = { j, i };
					if (!set.contains(p)) {
						set.add(new Integer[] { i, j });
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}