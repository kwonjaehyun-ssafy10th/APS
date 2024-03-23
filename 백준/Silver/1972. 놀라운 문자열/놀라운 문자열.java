import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String a = sc.next();
			if (a.charAt(0) == '*') break;
			int l = a.length();
			Boolean flag = true;
			for (int i = 0; i < l - 2; i++) {
				Set<String> set = new HashSet<>();
				int cnt = 0;
				for (int j = 0; j < l - 1 - i; j++) {
					String s = a.charAt(j) + "" + a.charAt(j + i + 1);
					set.add(s);
					cnt++;
				}
				if (set.size() != cnt) {
					flag = false;
					break;
				}
			}
			String ans;
			if (flag) ans = "";
			else ans = "NOT ";
			System.out.println(String.format("%s is %ssurprising.", a, ans));
		}
		
		sc.close();
	}

}