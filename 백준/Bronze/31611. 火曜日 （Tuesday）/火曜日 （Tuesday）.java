import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int ans = 0;
		if (x % 7 == 2) ans = 1;
		System.out.println(ans);
		
		sc.close();
	}

}
