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
			int[] temp = new int[j - i + 1];
			for (int k = 0; k < j - i + 1; k++) {
				temp[k] = arr[j - 1 - k];
			}
			for (int idx = 0; idx < j - i + 1; idx++) {
				arr[idx + i - 1] = temp[idx];
			}
		}
		for (int n = 0; n < N; n++) {
			System.out.print(String.format("%d ", arr[n]));
		}
		
		sc.close();
	}

}