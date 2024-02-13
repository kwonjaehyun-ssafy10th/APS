import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		long r = 0;
		for (int i = 0; i < N.length(); i++) {
			r = (r * 10 + (N.charAt(i) - '0')) % 20000303;
		}
		System.out.println(r);
		
		sc.close();
	}

}