import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Character> set = new HashSet<>();
		String u = "CAMBRIDGE";
		for (int i = 0; i < 9; i++) {
			set.add(u.charAt(i));
		}
		String w = sc.next();
		String ans = "";
		for (int i = 0; i < w.length(); i++) {
			if (!set.contains(w.charAt(i))) {
				ans += w.charAt(i);
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}