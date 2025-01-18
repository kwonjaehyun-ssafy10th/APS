import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			float m = 0;
			int p = 100000;
			for (int n = 0; n < N; n++) {
				float W = sc.nextFloat(), C = sc.nextFloat();
				if (m < W / C) {
					m = W / C;
					p = (int) C;
				} else if (m == W / C) {
					if (C < p) p = (int) C;
				}
			}
			System.out.println(p);
		}
		
		sc.close();
	}

}