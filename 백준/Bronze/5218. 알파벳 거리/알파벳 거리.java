import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String a = sc.next(), b = sc.next();
			System.out.print("Distances: ");
			for (int i = 0; i < a.length(); i++) {
				int x = (int) a.charAt(i), y = (int) b.charAt(i);
				int ans = y - x;
				if (ans < 0) ans += 26;
				System.out.print(ans + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}