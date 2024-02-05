import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] P = new int[N];
		for (int n = 0; n < N; n++) {
			P[n] = sc.nextInt();
		}
		Arrays.sort(P);
		int ans = 0;
		for (int n = 0; n < N; n++) {
			ans += P[n] * (N - n);
		}
		System.out.println(ans);
		
		sc.close();
	}

}