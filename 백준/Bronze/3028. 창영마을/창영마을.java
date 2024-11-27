import java.util.Scanner;

public class Main {

	static int p = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String o = sc.next();
		for (int i = 0; i < o.length(); i++) {
			a(o.charAt(i));
		}
		System.out.println(p);
		
		sc.close();
	}
	
	static void a(char s) {
		if (p == 1) {
			if (s == 'A') p = 2;
			else if (s == 'C') p = 3;
		} else if (p == 2) {
			if (s == 'A') p = 1;
			else if (s == 'B') p = 3;
		} else if (p == 3) {
			if (s == 'B') p = 2;
			else if (s == 'C') p = 1;
		}
	}

}