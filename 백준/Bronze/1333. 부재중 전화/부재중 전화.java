import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), L = sc.nextInt(), D = sc.nextInt();
		int l = N * L + 5 * (N - 1);
		Boolean[] song = new Boolean[l];
		int i = 0;
		while (i < l) {
			for (int j = 0; j < L; j++) {
				if (i == l) break;
				song[i++] = true;				
			}
			for (int j = 0; j < 5; j++) {
				if (i == l) break;
				song[i++] = false;
			}
		}
		Boolean[] bell = new Boolean[l];
		i = 0;
		while (i < l) {
			bell[i++] = true;
			for (int j = 0; j < D - 1; j++) {
				if (i == l) break;
				bell[i++] = false;
			}
		}
		int t = 0;
		int ans = 0;
		boolean flag = true;
		while (t < l) {
			if (!song[t] && bell[t]) {
				ans = t;
				flag = false;
				break;
			}
			t++;
		}
		if (flag) {
			ans = D * (int) Math.ceil((float) l / (float) D);
		}
		System.out.println(ans);
		
		sc.close();
	}

}