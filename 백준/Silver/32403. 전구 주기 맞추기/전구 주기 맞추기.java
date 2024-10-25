import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), T = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Set<Integer> dSet = new HashSet<>();
		for (int i = 1; i < T / 2 + 2; i++) {
			if(T % i == 0) {
				dSet.add(i);
				dSet.add(T / i);
			}
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int min = a[i];
			for (int j:dSet) {
				int dif = Math.abs(a[i] - j);
				if (dif < min) min = dif;
			}
			ans += min;
		}
		System.out.println(ans);
		
		sc.close();
	}

}