import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int M = sc.nextInt(), N = sc.nextInt();
		boolean[] isPrime = new boolean[N + 1];
		Arrays.fill(isPrime, true);
		isPrime[1] = false;
		for (int n = 2; n < N / 2 + 1; n++) {
			if (isPrime[n]) {
				int i = 2;
				while (n * i <= N) {
					isPrime[n * i++] = false;
				}
			}
		}
		for (int n = M; n <= N; n++) {
			if (isPrime[n]) sb.append(n).append("\n");
		}
		System.out.println(sb);
		
		sc.close();
	}

}