import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<List<Integer>> list = new ArrayList<>();
		List<List<Integer>> dup = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			list.add(new ArrayList<Integer>());
			dup.add(new ArrayList<Integer>());
		}
		for (int n = 0; n < N; n++) {
			for (int i = 0; i < 3; i++) {
				int a = sc.nextInt();
				if (list.get(i).contains(a)) {
					dup.get(i).add(a);
				}
				list.get(i).add(a);
			}
		}
		int[] s = new int[N];
		for (int n = 0; n < N; n++) {
			for (int i = 0; i < 3; i++) {
				if (!dup.get(i).contains(list.get(i).get(n))) {
					s[n] += list.get(i).get(n);
				}
			}
		}
		for (int n = 0; n < N; n++) {
			System.out.println(s[n]);
		}
		
		sc.close();
	}

}