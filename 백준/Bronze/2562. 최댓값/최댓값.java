import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		int idx = 0;
		for (int i = 0; i < 9; i++) {
			int n = sc.nextInt();
			if (ans < n) {
				ans = n;
				idx = i;
			}
		}
		System.out.println(ans);
		System.out.println(idx + 1);
		
		sc.close();
	}

}