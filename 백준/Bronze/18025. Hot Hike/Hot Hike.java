import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int t = 41, d = -1;
		for (int i = 0; i < n - 2; i++) {
			int m = Math.max(arr[i], arr[i + 2]);
			if (m < t) {
				t = m;
				d = i;
			}
		}
		System.out.println(d + 1 + " " + t);
		
		sc.close();
	}

}