import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		int N = sc.nextInt();
		int min = Math.abs(A - B);
		int flag = 0;
		for (int n = 0; n < N; n++) {
			int f = sc.nextInt();
			if (Math.abs(B- f) < min) {
				min = Math.abs(B - f);
				flag = 1;
			}
		}
		System.out.println(min + flag);
		
		sc.close();
	}

}