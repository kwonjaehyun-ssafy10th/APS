import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int ans = 0;
		if (N < 5) ans = 4;
		else {
			int a = (int) Math.sqrt(N);
			if (N <= a * a) ans = (a - 1) * 4;
			else if (N <= a * (a + 1)) ans = (2 * a - 1) * 2;
			else ans = a * 4;
		}
		System.out.println(ans);
		
		sc.close();
	}

}