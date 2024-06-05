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
		int M = sc.nextInt();
		for (int m = 0; m < M; m++) {
			ans += arr[sc.nextInt() - 1];
		}
		System.out.println(ans);
		
		sc.close();
	}

}