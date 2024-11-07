import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] f = new long[n + 1];
		f[1] = 1L;
		for (int i = 2; i < n + 1; i++) {
			f[i] = f[i - 2] + f[i - 1];
		}
		System.out.println(f[n]);
		
		sc.close();
	}

}