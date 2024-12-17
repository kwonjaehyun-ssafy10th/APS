import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt(), f = sc.nextInt(), c = sc.nextInt();
		e += f;
		int ans = 0;
		while (c <= e) {
			int n = e / c;
			ans += n;
			e = e % c + n;
		}
		System.out.println(ans);
		
		sc.close();
	}

}