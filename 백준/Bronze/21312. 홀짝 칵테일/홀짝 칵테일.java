import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		boolean flag = true;
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 1) flag = false;
		}
		int ans = 1;
		for (int n: arr) {
			if (n % 2 == 1) ans *= n;
		}
		if (ans == 1) {
			if (flag) {
				for (int n: arr) {
					ans *= n;
				}
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}