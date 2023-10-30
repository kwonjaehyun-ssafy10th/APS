import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		for (int i = N - 5; i < N; i++) {
			System.out.print(str.charAt(i));
		}
		
		sc.close();
	}

}