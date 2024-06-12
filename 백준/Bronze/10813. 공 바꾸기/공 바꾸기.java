import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[] arr = new int[N];
		for (int n = 0; n < N; n++) {
			arr[n] = n + 1;
		}
		for (int m = 0; m < M; m++) {
			int i = sc.nextInt(), j = sc.nextInt();
			int temp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = temp;
		}
		for (int n = 0; n < N; n++) {
			System.out.print(String.format("%d ", arr[n]));
		}
		
		sc.close();
	}

}
