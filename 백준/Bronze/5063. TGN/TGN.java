import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			int r = sc.nextInt(), e = sc.nextInt(), c = sc.nextInt();
			String ans = "";
			if (r < e - c) ans = "advertise";
			else if (r > e - c) ans = "do not advertise";
			else ans = "does not matter";
			System.out.println(ans);
		}
		
		sc.close();
	}

}