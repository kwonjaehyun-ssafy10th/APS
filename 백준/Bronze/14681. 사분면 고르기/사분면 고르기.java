import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt();
		int ans;
		if (x > 0) {
			if (y > 0) ans = 1;
			else ans = 4;
		} else {
			if (y > 0) ans = 2;
			else ans = 3;
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}