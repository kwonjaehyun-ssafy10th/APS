import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String b = sc.next();
		char p = b.charAt(0);
		int h = 10;
		for (int i = 1; i < b.length(); i++) {
			char c = b.charAt(i);
			if (p == c) h += 5;
			else h += 10;
			p = c;
		}
		System.out.println(h);
		
		sc.close();
	}

}