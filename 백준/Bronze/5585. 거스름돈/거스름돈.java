import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] change = new int[] { 500, 100, 50, 10, 5, 1 };
		int p = sc.nextInt();
		int r = 1000 - p;
		int ans = 0;
		for (int i:change) {
			ans += r / i;
			r %= i;
		}
		System.out.println(ans);
		
		sc.close();
	}

}