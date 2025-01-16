import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next(), b = sc.next();
		int y = Integer.valueOf(b + a);
		int x = Integer.valueOf(a);
		String ans = "No";
		if (isPrime(x) && isPrime(y)) ans = "Yes";
		System.out.println(ans);
		
		sc.close();
	}
	
	static boolean isPrime(int n) {
		if (n < 2) return false;
		if (n == 2 || n == 3) return true;
		if (n % 2 == 0 || n % 3 == 0) return true;
		int i = 5;
		while (i * i < n) {
			if (n % i == 0 || n % (i + 2) == 0) return false;
			i += 6;
		}
		return true;
		
	}

}