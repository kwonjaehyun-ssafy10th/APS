import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String line = sc.nextLine();
			if ("#".equals(line)) break;
			boolean[] a = new boolean[26];
			for (int i = 0; i < line.length(); i++) {
				int c = (int) line.charAt(i);
				if (65 <= c && c < 91) a[c - 65] = true;
				else if (97 <= c && c < 123) a[c - 97] = true;
			}
			int ans = 0;
			for (int i = 0; i < 26; i++) {
				if (a[i]) ans++;
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}