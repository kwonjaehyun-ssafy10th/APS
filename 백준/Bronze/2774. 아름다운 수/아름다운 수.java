import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String X = sc.next();
			Set<Character> s = new HashSet<>();
			for (int i = 0; i < X.length(); i++) {
				s.add(X.charAt(i));
			}
			System.out.println(s.size());
		}
		
		sc.close();
	}

}