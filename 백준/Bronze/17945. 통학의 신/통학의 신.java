import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		for (int x = -1000; x <= 1000; x++) {
			if (x * x + 2 * A * x + B == 0) {
				System.out.print(String.format("%d ", x));
			}
		}
		
		sc.close();
	}

}