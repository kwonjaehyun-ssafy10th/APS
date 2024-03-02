import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		char p = S.charAt(0);
		int cnt = 0;
		for (int i = 1; i < S.length(); i++) {
			char c = S.charAt(i);
			if (p != c) cnt++;
			p = c;
		}
		System.out.println(cnt / 2 + cnt % 2);
		
		sc.close();
	}

}