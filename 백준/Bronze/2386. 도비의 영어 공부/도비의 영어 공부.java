import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String l = sc.nextLine();
			if ("#".equals(l)) break;
			char c = l.charAt(0);
			String s = l.substring(2);
			int ans = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c || s.charAt(i) == (char) (c - 32)) ans++;
			}
			System.out.println(c + " " + ans);
		}
		
		sc.close();
	}

}