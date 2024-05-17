import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] s = { 100, 100, 200, 200, 300, 300, 400, 400, 500 };
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		boolean flag = false;
		for (int i = 0; i < 9; i++) {
			if (s[i] < arr[i]) {
				flag = true;
				break;
			}
		}
		String ans;
		if (flag) ans = "hacker";
		else if (sum < 100) ans = "none";
		else ans = "draw";
		System.out.println(ans);
		
		sc.close();
	}

}