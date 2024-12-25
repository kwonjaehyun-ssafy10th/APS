import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[] X = new int[N];
		for (int n = 0; n < N; n++) {
			X[n] = sc.nextInt();
		}
		int cnt = 0, i = 0;
		while (i < N - 1) {
			i += sc.nextInt();
			if (i < N) i += X[i];
			cnt++;
		}
		System.out.println(cnt);
		
		sc.close();
	}

}