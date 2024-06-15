import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ans = 0;
		for (int n = 0; n < N; n++) {
			int T1 = sc.nextInt(), T2 = sc.nextInt(), T3 = sc.nextInt();
			boolean flag = true;
			if (T1 == -1) {
				flag = false;
			} else if (T2 < T1 && T2 != -1) {
				flag = false;
			} else if ((T3 < T2 && T3 != -1) || (T2 == -1 && T3 != -1)) {
				flag = false;
			}
			if (flag) ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}