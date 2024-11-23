import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int i = sc.nextInt();
			String s = sc.next();
			String ans = s.substring(0, i - 1) + s.substring(i);
			System.out.println(ans);
		}
		
		sc.close();
	}

}