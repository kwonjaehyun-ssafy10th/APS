import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), D = sc.nextInt(), p = sc.nextInt();
		int A[] = new int[N];
		int ans = 0;
		for (int n = 0; n < N; n++) {
			A[n] = sc.nextInt();
		}
		for (int n = 0; n < N; n++) {
			while (0 < A[n]) {
				A[n] -= D;
				ans++;
			}
			if (n == N - 1) break;
			if (A[n] < 0) {
				A[n + 1] = Math.max(0,  A[n + 1] - (-A[n] * p / 100));
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}