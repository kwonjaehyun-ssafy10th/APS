import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int l = word.length();
		String a = ".";
		String b = ".";
		String c = "#";
		for (int i = 0; i < l; i++) {
			String s;
			if (i % 3 != 2) {
				s = "#";
			} else {
				s = "*";
			}
			String t = "." + s + "..";
			a += t;
			t = s + "." + s + ".";
			b += t;
			if (i < l - 1 && i % 3 == 1) {
				s = "*";
			}
			t = "." + word.charAt(i) + "." + s;
			c += t;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
		
		sc.close();
	}

}