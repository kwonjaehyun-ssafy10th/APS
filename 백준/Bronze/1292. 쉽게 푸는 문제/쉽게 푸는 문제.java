import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		int ans = 0;
		int i = 1;
		int j = 1;
		while (true) {
			for (int k = 0; k < j; k++) {
				if (A <= i && i <= B) ans += j;
				i++;
			}
			if (B < i) break;
			j++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}