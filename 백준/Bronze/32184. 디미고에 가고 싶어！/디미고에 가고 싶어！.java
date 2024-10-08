import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		int ans = (B - A + 2) / 2;
		if (A % 2 == 0 && B % 2 == 1) ans++;
		System.out.println(ans);
		
		sc.close();
	}

}