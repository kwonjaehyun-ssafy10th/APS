import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt(), S = sc.nextInt();
		String ans = "NO";
		for (int n = 0; n < N; n++) {
			int c = sc.nextInt(), p = sc.nextInt();
			if (c <= X && S < p) {
				ans = "YES";
				break;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}