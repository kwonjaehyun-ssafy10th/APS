import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1, j = 1, s = 1;
		while (s < n) {
			j += 4 * i;
			s += j;
			i++;
		}
		int ans = i;
		if (s != n) ans -= 1;
		System.out.println(ans);
		
		sc.close();
	}

}