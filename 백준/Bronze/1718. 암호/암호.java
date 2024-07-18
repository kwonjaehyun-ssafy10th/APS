import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String plain = sc.nextLine();
		String key = sc.next();
		String ans = "";
		int i = 0;
		int j = 0;
		while (i < plain.length()) {
			if (' ' == plain.charAt(i)) {
				ans += ' ';
			} else {
				int d = plain.charAt(i) - key.charAt(j);
				d = (d - 1) % 26 + 1;
				if (d <= 0) d += 26;
				char c = (char) (d + 96);
				ans += c;
			}
			i++;
			j++;
			if (j == key.length()) j = 0;
		}
		System.out.println(ans);
		
		sc.close();
	}

}