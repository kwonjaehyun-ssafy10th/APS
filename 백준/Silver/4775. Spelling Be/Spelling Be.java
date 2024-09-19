import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> set = new HashSet<>();
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			set.add(sc.next());
		}
		int M = sc.nextInt();
		for (int m = 1; m <= M; m++) {
			List<String> list = new ArrayList<>();
			while (true) {
				String word = sc.next();
				if ("-1".equals(word)) break;
				if (!set.contains(word)) list.add(word);
			}
			if (list.isEmpty()) {
				System.out.println(String.format("Email %d is spelled correctly.", m));
			} else {
				System.out.println(String.format("Email %d is not spelled correctly.", m));
				for (String word:list) {
					System.out.println(word);
				}
			}
		}
		System.out.println("End of Output");
		
		sc.close();
	}

}