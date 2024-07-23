import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int L = sc.nextInt(), R = sc.nextInt(), S = sc.nextInt();
			int dl = S - L;
			int dr = R - S;
			int ans;
			if (dr <= dl) {
				ans = 2 * dr;
			} else {
				ans = 2 * dl + 1;
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}