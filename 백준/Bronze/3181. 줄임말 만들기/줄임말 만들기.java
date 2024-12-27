import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> set = new HashSet<>();
		set.add("i");
		set.add("pa");
		set.add("te");
		set.add("ni");
		set.add("niti");
		set.add("a");
		set.add("ali");
		set.add("nego");
		set.add("no");
		set.add("ili");
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		String ans = String.valueOf((char) ((int) st.nextToken().charAt(0) - 32));
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			if (!set.contains(word)) {
				ans += String.valueOf((char) ((int) word.charAt(0) - 32));
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}