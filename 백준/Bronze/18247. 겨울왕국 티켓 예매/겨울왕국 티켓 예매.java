import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt(), M = sc.nextInt();
			int ans;
			if (N < 12 || M < 4) ans = -1;
			else ans = M * 11 + 4;
			System.out.println(ans);
		}
		
		sc.close();
	}

}