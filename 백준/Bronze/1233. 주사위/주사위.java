import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S1 = sc.nextInt(), S2 = sc.nextInt(), S3 = sc.nextInt();
		int[] arr = new int[S1 + S2 + S3 + 1];
		int max = 0;
		int ans = 3;
		for (int i = 1; i < S1 + 1; i++) {
			for (int j = 1; j < S2 + 1; j++) {
				for (int k = 1; k < S3 + 1; k++) {
						arr[i + j + k]++;
					}
				}
			}
		for (int i = 3; i < S1 + S2 + S3 + 1; i++) {
			if (max < arr[i]) {
				max = arr[i];
				ans = i;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}