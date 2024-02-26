import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		for (int n = 0; n < N; n++) {
			String word = sc.next();
			List<Character> list = new ArrayList<>();
			char p = word.charAt(0);
			list.add(p);
			boolean flag = true;
			int i = 1;
			while (i < word.length()) {
				char c = word.charAt(i++);
				if (p != c) {
					if (!list.contains(c)) {
						list.add(c);
					} else {
						flag = false;
						break;
					}
				}
				p = c;
			}
			if (flag) cnt++;
		}
		System.out.println(cnt);
		
		sc.close();
	}

}