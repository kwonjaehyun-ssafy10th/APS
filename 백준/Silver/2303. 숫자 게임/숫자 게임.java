import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = 0;
		int ans = 0;
		for (int n = 0; n < N; n++) {
			int[] arr = new int[5];
			for (int i = 0; i < 5; i++) {
				arr[i] = sc.nextInt();
			}
			int m = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = i + 1; j < 4; j++) {
					for (int k = j + 1; k < 5; k++) {
						m = Math.max(m, (arr[i] + arr[j] + arr[k]) % 10);
					}
				}
			}
			if (M <= m) {
				M = m;
				ans = n + 1;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}