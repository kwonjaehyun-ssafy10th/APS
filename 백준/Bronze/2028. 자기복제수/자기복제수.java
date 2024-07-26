import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String N = sc.next();
			int n = Integer.valueOf(N);
			int m = n * n;
			String M = String.valueOf(m);
			if (N.equals(M.substring(M.length() - N.length()))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		
		sc.close();
	}

}