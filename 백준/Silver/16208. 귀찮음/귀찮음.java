import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			Integer l = sc.nextInt();
			sum += l;
			arr[i] = l;
		}
		Arrays.sort(arr);
		int total = 0;
		for (int i = 0; i < n - 1; i++) {
			total += arr[i] * (sum - arr[i]);
			sum -= arr[i];
		}
		System.out.println(total);
		
		sc.close();
	}

}