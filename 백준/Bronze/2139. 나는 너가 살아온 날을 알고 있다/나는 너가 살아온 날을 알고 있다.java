import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
		for (int i = 2; i < 12; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		while (true) {
			int d = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt();
			if (d == 0 && m == 0 && y == 0) break;
			int ans = arr[m - 1] + d;
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				if (2 < m) ans++;
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}