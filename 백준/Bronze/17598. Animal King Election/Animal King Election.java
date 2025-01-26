import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Tiger = 0, Lion = 0;
		for (int i = 0; i < 9; i++) {
			if ("Tiger".equals(sc.next())) {
				Tiger++;
			} else {
				Lion++;
			}
		}
		String ans = "Tiger";
		if (Tiger < Lion) ans = "Lion";
		System.out.println(ans);
		
		sc.close();
	}

}