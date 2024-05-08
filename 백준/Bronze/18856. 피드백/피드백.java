import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int n = 0; n < N - 1; n++) {
			arr[n] = n + 1;
		}
		arr[N - 1] = 997;
		
		System.out.println(N);
		for (int n = 0; n < N; n++) {
			System.out.print(arr[n] + " ");
		}
		
		sc.close();
	}

}