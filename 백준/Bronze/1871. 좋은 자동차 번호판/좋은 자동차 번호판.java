import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			String[] a = sc.next().split("-");
			int stringValue = 0;
			for (int i = 0; i < 3; i++) {
				stringValue += (a[0].charAt(i) - 'A') * (int) Math.pow(26, 2 - i);
			}
			int numValue = Integer.parseInt(a[1]);
			if (100 < Math.abs(stringValue - numValue)) {
				System.out.println("not nice");
			} else {
				System.out.println("nice");
			}
		}
		
		sc.close();
	}

}