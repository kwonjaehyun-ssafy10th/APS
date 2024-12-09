import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String b = sc.next();
			if (b.equals("#")) break;
			int cnt = 0;
			String ans = "";
			for (int i = 0; i < b.length() - 1; i++) {
				char c = b.charAt(i);
				if (c == '1') cnt++;
				ans += c;
			}
			if (b.charAt(b.length() - 1) == 'e') {
				if (cnt % 2 == 0) ans += '0';
				else ans += '1';
			} else {
				if (cnt % 2 == 0) ans += '1';
				else ans += '0';
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}