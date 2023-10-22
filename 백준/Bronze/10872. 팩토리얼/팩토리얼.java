import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(factorial(N));
		
		sc.close();
	}
	
	static int factorial(int n) {
		if (n < 2) return 1;
		return factorial(n - 1) * n;
	}

}