import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(), Seed = sc.nextInt(), X1 = sc.nextInt(), X2 = sc.nextInt();
		int ans1 = 0, ans2 = 0;
		outer: for (int a = 0; a < m; a++) {
			for (int c = 0; c < m; c++) {
				if (X1 == (a * Seed + c) % m && X2 == (a * X1 + c) % m) {
					ans1 = a;
					ans2 = c;
					break outer;
				}
			}
		}
		System.out.println(ans1 + " " + ans2);
		
		sc.close();
	}

}