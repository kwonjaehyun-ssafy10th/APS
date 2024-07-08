import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), Q = sc.nextInt();
		int[] arr = new int[N];
		arr[0] = sc.nextInt();
		for (int n = 1; n < N; n++) {
			arr[n] = arr[n - 1] + sc.nextInt();
		}
		for (int q = 0; q < Q; q++) {
			boolean flag = true;
			int t = sc.nextInt();
			for (int n = 0; n < N; n++) {
				if (t < arr[n]) {
					System.out.println(n + 1);
					flag = false;
					break;
				}
			}
			if (flag) System.out.println(N);
		}
		
		sc.close();
	}

}