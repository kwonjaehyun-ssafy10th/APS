import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String a0 = sc.next();
			if ("0".equals(a0)) break;
			Set<String> set = new HashSet<>();
			set.add(a0);
			String p = String.valueOf(Integer.parseInt(a0) * Integer.parseInt(a0));
			while (true) {
				while (p.length() < 8) {
					p = "0" + p;
				}
				String ai = p.substring(2, 6);
				if (set.contains(ai)) break;
				else {
					set.add(ai);
					p = String.valueOf(Integer.parseInt(ai) * Integer.parseInt(ai));
				}
			}
			System.out.println(set.size());
		}
		
		sc.close();
	}

}