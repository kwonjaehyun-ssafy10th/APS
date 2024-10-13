import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans = n;
		if (n == 2) ans = 3;
		System.out.println(ans);
		
		sc.close();
	}

}