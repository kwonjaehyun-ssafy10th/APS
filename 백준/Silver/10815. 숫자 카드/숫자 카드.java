import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Set<Integer> cards = new HashSet<>();
		for (int n = 0; n < N; n++) {
			cards.add(sc.nextInt());
		}
		int M = sc.nextInt();
		List<Integer> ans = new ArrayList<>();
		for (int m = 0; m < M; m++) {
			int b = 0;
			if (cards.contains(sc.nextInt())) b = 1;
			ans.add(b);
		}
		for (int b:ans) {
			System.out.print(b + " ");
		}
		
		sc.close();
	}

}