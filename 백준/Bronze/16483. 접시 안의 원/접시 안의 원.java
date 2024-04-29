import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		System.out.println(Math.round(Math.pow((double) T / 2, 2) + 1e-6));
		
		sc.close();
	}

}