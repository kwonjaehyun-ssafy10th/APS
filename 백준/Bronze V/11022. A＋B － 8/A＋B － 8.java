import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int A = sc.nextInt(), B = sc.nextInt();
			System.out.println(String.format("Case #%d: %d + %d = %d", t, A, B, A + B));
		}
		
		sc.close();
	}

}