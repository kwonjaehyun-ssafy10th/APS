import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
		}
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		if (2 * b == a + c) {
			System.out.println(arr[N - 1] + (b - a));
		} else {
			System.out.println(arr[N - 1] * (b / a));
		}
		
		sc.close();
	}

}