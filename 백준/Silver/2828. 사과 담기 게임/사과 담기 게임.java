import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int J = sc.nextInt();
		int l = 1, r = M;
		int ans = 0;
		for (int j = 0; j < J; j++) {
			int p = sc.nextInt();
			int dl = l - p, dr = p - r;
			if (0 < dl) {
				ans += dl; l -= dl; r -= dl;
			}
			else if (0 < dr) {
				ans += dr; l += dr; r += dr;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}