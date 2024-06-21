import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), K = sc.nextInt();
		for (int n = 0; n < N - 1; n++) {
			K /= 2;
		}
		System.out.println(K);
		
		sc.close();
	}

}