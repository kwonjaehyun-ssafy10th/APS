import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans;
		if (n < 3) ans = 0;
		else if (n == 3) ans = 1;
		else {
			ans = 2;
			int d = 2;
			for (int i = 1; i < n - 3; i++) {
				ans += d;
				if (i % 2 == 0) d++;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}