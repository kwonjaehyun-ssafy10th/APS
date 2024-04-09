import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String ans = "CY";
		if ((N % 4) % 2 == 0) ans = "SK";
		System.out.println(ans);
		
		sc.close();
	}

}