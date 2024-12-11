import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = Integer.MAX_VALUE;
		int[] ans = new int[3];
		for (int i = 1; i < (int) Math.pow(n, (float) 1 / (float) 3) + 2; i++) {
			for (int j = 1; j < (int) Math.pow(n, (float) 1 / (float) 2) + 2; j++) {
				if (n / i / j == (float) n / (float) i / (float) j) {
					int k = n / i / j;
					int s = 2 * (i + j + k);
					if (s < m) {
						m = s;
						ans[0] = i;
						ans[1] = j;
						ans[2] = k;
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.print(ans[i] + " ");
		}
		
		sc.close();
	}

}