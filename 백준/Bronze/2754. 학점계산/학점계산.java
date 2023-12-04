import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float ans = 0.0f;
		String str = sc.next();
		if (str.length() == 2) {
			ans += 69 - Integer.valueOf(str.charAt(0));
			if (str.charAt(1) == '+') {
				ans += 0.3;
			} else if (str.charAt(1) == '-') {
				ans -= 0.3;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}