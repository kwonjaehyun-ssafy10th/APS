import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			int M = sc.nextInt();
			int[] arr = new int[M];
			for (int m = 0; m < M; m++) {
				arr[m] = sc.nextInt();
			}
			int cnt = 0;
			boolean flag = false;
			while (true) {
				flag = true;
				int l = arr.length;
				for (int i = 0; i < l; i++) {
					if (arr[i] != 0) {
						flag = false;
						break;
					}
				}
				if (flag) break;
				if (l < 2) break;
				int[] temp = new int[l - 1];
				for (int i = 0; i < l - 1; i++) {
					temp[i] = arr[i + 1] - arr[i];
				}
				arr = temp;
				cnt++;
			}
			String ans = "";
			if (flag) {
				for (int i = 0; i < cnt; i++) {
					ans += 'z';
				}
				ans += "ap!";
			} else {
				if (0 < arr[0]) ans = "*fizzle*";
				else ans = "*bunny*";
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}