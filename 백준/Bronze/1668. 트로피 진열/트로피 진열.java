import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
		}
		int cntL = 1;
		int highestL = arr[0];
		for (int n = 1; n < N; n++) {
			if (highestL < arr[n]) {
				highestL = arr[n];
				cntL++;
			}
		}
		int cntR = 1;
		int highestR = arr[N - 1];
		for (int n = N - 2; 0 <= n; n--) {
			if (highestR < arr[n]) {
				highestR = arr[n];
				cntR++;
			}
		}
		System.out.println(cntL);
		System.out.println(cntR);
		
		sc.close();
	}

}