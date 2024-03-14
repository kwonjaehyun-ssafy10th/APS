import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), T = sc.nextInt(), C = sc.nextInt(), P = sc.nextInt();
		System.out.println((N - 1) / T * C * P);
		
		sc.close();
	}

}