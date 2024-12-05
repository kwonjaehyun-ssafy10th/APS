import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String a = sc.next();
			if (a.equals("#")) break;
			String b = sc.next(), c = sc.next();
			System.out.print(a + " " + b + " " + c + " ");
			String d = "";
			for (int i = 0; i < a.length(); i++) {
				d += (char) ((((int) c.charAt(i) - ((int) a.charAt(i) - (int) b.charAt(i)) % 26) - 97 + 26) % 26 + 97);
			}
			System.out.println(d);
		}
		
		sc.close();
	}

}