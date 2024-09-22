import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = 0;
		List<Integer> ans = new ArrayList<>();
		for (int i = N / 2; i < N * 2 / 3 + 2; i++) {
			List<Integer> list = new ArrayList<>();
			int a = N, b = i;
			list.add(a);
			list.add(b);
			while (0 <= b) {
				int temp = a;
				a = b;
				b = temp - b;
				list.add(b);
			}
			int s = list.size();
			if (M < s) {
				M = s;
				ans = list;
			}
		}
		ans.remove(M - 1);
		System.out.println(M - 1);
		for (int n:ans) {
			System.out.print(n + " ");
		}
		
		sc.close();
	}

}