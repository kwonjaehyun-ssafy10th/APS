import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String S = sc.next();
			if (S.equals("0")) break;
			while (1 < S.length()) {
				System.out.print(S + " ");
				int m = 1;
				for (int i = 0; i < S.length(); i++) {
					m *= S.charAt(i) - '0';
				}
				S = String.valueOf(m);
			}
			System.out.println(S);
		}
		
		sc.close();
	}

}