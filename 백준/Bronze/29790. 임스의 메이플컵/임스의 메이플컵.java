import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), U = sc.nextInt(), L = sc.nextInt();
		if (999 < N) {
			if (7999 < U || 259 < L) {
				System.out.println("Very Good");
			} else {
				System.out.println("Good");
			}
		} else {
			System.out.println("Bad");
		}
		
		sc.close();
	}

}