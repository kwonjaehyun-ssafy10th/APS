import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			while (9 < N) {
				int q = N / 10;
				int r = N % 10;
				N = q + r;
			}
			System.out.println(N);
		}
		
		sc.close();
	}

}