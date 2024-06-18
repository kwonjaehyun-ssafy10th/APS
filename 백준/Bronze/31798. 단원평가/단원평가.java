import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int ans = 0;
		if (a == 0) ans = (int) Math.pow(c, 2) - b;
		if (b == 0) ans = (int) Math.pow(c, 2) - a;
		if (c == 0) ans = (int) Math.sqrt(a + b);
		System.out.println(ans);
		
		sc.close();
	}

}