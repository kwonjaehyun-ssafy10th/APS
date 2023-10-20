import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		for (int i = 0; i < 5; i++) {
			ans += Math.pow(sc.nextInt(), 2);
		}
		
		System.out.println(ans % 10);
		
		sc.close();
	}

}