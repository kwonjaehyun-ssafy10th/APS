import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i = 0; i < 2 * N - 1; i++) {
			for (int j = 0; j < N - Math.abs((N - i - 1)) - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < Math.abs((N - i - 1) * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}