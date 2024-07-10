import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[] A = new int[N], B = new int[M];
		for (int n = 0; n < N; n++) {
			A[n] = sc.nextInt();
		}
		for (int m = 0; m < M; m++) {
			B[m] = sc.nextInt();
		}
		int i = 0, j = 0, cnt = 0;
		while (j < M) {
			if (A[i] < B[j]) {
				cnt += A[i];
				N--;
				int[] temp = new int[N];
				for (int k = 0; k < i; k++) {
					temp[k] = A[k];
				}
				for (int k = i + 1; k < N + 1; k++) {
					temp[k - 1] = A[k];
				}
				A = temp;
			} else {
				A[i] -= B[j++];
			}
		}
		while (i < N) {
			cnt += A[i++];
		}
		System.out.println(cnt);
		
		
		sc.close();
	}

}