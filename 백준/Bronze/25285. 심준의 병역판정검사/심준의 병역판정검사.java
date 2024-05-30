import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			float h = sc.nextFloat(), w = sc.nextFloat();
			float b = w / (float) Math.pow((h / 100), 2);
			int ans;
			if (h < 140.1) ans = 6;
			else if (h < 146) ans = 5;
			else if (h < 159) ans = 4;
			else if (h < 161) {
				if (16 <= b && b < 35) ans = 3;
				else ans = 4;
			}
			else if (h < 204) {
				if (20 <= b && b < 25) ans = 1;
				else if ((18.5 <= b && b < 20) || (25 <= b && b < 30)) ans = 2;
				else if ((16 <= b && b < 18.5) || (30 <= b && b < 35)) ans = 3;
				else ans = 4;
			}
			else ans = 4;
			System.out.println(ans);
		}
		
		sc.close();
	}

}