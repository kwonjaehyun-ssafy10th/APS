import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			int n = Integer.valueOf(str.charAt(i));
			System.out.print((char) (n + Math.pow(-1, Boolean.compare(true, n < 90)) * 32));
		}

		sc.close();
	}

}