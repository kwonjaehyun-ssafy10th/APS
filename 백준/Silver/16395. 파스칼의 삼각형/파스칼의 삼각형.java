import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		if (n < 3) {
			System.out.println(1);
		} else {
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				arr[i][0] = 1;
				arr[i][i] = 1;
			}
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < n - 1; j++) {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
			System.out.println(arr[n - 1][k - 1]);
		}
		
		sc.close();
	}

}