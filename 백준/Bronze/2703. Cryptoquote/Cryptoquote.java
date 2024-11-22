import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			String e = sc.nextLine();
			String d = sc.nextLine();
			String ans = "";
			for (int i = 0; i < e.length(); i++) {
				if (e.charAt(i) == ' ') ans += ' ';
				else ans += d.charAt(e.charAt(i) - 65);
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}