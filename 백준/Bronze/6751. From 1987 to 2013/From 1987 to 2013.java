import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Y = sc.nextInt();
		while (true) {
			Y++;
			String y = String.valueOf(Y);
			Set<Character> set = new HashSet<>();
			boolean flag = true;
			for (int i = 0; i < y.length(); i++) {
				char c = y.charAt(i);
				if (set.contains(c)) {
					flag = false;
					break;
				} else {
					set.add(c);
				}
			}
			if (flag) {
				System.out.println(Y);
				break;
			}
		}
		
		sc.close();
	}

}