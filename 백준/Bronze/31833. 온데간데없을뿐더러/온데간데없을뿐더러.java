import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		StringBuilder A = new StringBuilder();
		for (int n = 0; n < N; n++) {
			A.append(sc.next());
		}
		StringBuilder B = new StringBuilder();
		for (int n = 0; n < N; n++) {
			B.append(sc.next());
		}
		long X = Long.parseLong(String.valueOf(A));
		long Y = Long.parseLong(String.valueOf(B));
		System.out.println(Math.min(X, Y));
		
		sc.close();
	}

}