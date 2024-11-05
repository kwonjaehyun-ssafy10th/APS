import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
		}
		Arrays.sort(arr);
		int m = 0;
		for (int n = 1; n < N; n++) {
			m += arr[n] - arr[n - 1];
		}
		m += arr[N - 1] - arr[0];
		System.out.println(m);
		
		sc.close();
	}

}