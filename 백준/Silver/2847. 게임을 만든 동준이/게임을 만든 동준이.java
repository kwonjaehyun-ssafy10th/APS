import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
        for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
		}
		int ans = 0;
		for (int i = N - 2; 0 <= i; i--) {
			int d = Math.max(arr[i] - arr[i + 1] + 1, 0);
			arr[i] -= d;
			ans += d;
		}
		System.out.println(ans);
		
		sc.close();
	}

}