import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 1;
		int j = 1;
		int ans = 1;
		while (i < N) {
			i += 6 * j++;
			ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}