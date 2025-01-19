import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int[] arr = new int[5];
			for (int i = 0; i < 5; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			if (3 < arr[3] - arr[1]) {
				System.out.println("KIN");
			} else {
				System.out.println(arr[1] + arr[2] + arr[3]);
			}
		}
		
		sc.close();
	}

}