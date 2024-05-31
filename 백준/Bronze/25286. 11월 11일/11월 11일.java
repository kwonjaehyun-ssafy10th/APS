import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] c = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int y = sc.nextInt(), m = sc.nextInt();
			m = (m - 2) % 12 + 1;
			if (m == 0) m = 12;
			int d = c[m - 1];
			if (m == 2 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) d++;
			if (m == 12) y--;
			System.out.println(y + " " + m + " " + d);
		}
		
		sc.close();
	}

}