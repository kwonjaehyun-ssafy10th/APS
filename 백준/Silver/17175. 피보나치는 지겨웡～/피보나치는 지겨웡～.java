import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] f = new int[Math.max(2, n + 1)];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = (f[i - 2] + f[i - 1] + 1) % 1000000007;
		}
		System.out.println(f[n]);
		
		sc.close();
	}

}