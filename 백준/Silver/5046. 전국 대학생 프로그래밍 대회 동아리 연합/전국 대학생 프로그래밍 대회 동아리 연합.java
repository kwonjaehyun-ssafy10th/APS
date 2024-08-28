import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), B = sc.nextInt(), H = sc.nextInt(), W = sc.nextInt();
		int m = B + 1;
		for (int h = 0; h < H; h++) {
			int p = sc.nextInt();
			int c = B + 1;
			for (int w = 0; w < W; w++) {
				int a = sc.nextInt();
				if (N <= a) {
					c = N * p;
				}
			}
			if (c < m && c <= B) m = c;
		}
		if (m <= B) System.out.println(m);
		else System.out.println("stay home");
		
		sc.close();
	}

}