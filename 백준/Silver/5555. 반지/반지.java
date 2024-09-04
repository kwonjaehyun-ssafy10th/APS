import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String target = sc.next();
		int length = target.length();
		int N = sc.nextInt();
		int ans = 0;
		for (int n = 0; n < N; n++) {
			String ring = sc.next();
			ring += ring.substring(0, length);
			if (ring.contains(target)) ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}