import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int p = sc.nextInt();
			System.out.print(p + " ");
			for (int n = 0; n < N - 1; n++) {
				int c = sc.nextInt();
				if (p != c) System.out.print(c + " ");
				p = c;
			}
			System.out.println("$");
		}
		
		sc.close();
	}

}