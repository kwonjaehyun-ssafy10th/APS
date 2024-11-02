import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), L = sc.nextInt();
		boolean flag = true;
		for (int i = L; i <= 100; i++) {
			double n = ((double) N - ((double)i * (double) (i - 1) / 2)) / (float) i;
			if (n < 0) break;
			if (n == (int) n) {
				int m = (int) n;
				for (int j = 0; j < i; j++) {
					System.out.print(m + j + " ");
				}
				flag = false;
				break;
			}
		}
		if (flag) System.out.println(-1);
		
		sc.close();
	}

}