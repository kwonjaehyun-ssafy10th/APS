import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] x = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
		}
		long ans = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				ans += Math.abs(x[i] - x[j]);
			}
		}
		System.out.println(ans * 2);
		
		sc.close();
	}

}