import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] dq = new int[N];
		for (int n = 0; n < N; n++) {
			dq[n] = sc.nextInt();
		}
		boolean[] check = new boolean[N];
		int i = 0;
		for (int n = 0; n < N; n++) {
			System.out.print(i + 1 + " ");
			if (n == N - 1) break;
			check[i] = true;
			int r = dq[i];
			if (0 < r) {
				for (int j = 0; j < r; j++) {
					i++;
					i %= N;
					if (i < 0) i += N;
					if (check[i]) j--;
				}
			} else {
				for (int j = 0; j < -r; j++) {
					i--;
					i %= N;
					if (i < 0) i += N;
					if (check[i]) j--;
				}
			}
		}
		
		sc.close();
	}

}