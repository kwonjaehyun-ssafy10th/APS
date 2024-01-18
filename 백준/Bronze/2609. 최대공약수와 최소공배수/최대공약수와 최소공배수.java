import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		System.out.println(gcd(max, min));
		System.out.println(lcm(max, min));
		
		sc.close();
	}
	
	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
	
	static int lcm(int a, int b) {
		return a * b / gcd(a,  b);
	}

}