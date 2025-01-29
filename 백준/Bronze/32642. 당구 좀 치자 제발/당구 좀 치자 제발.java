import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long r = 0;
		long sum = 0;
		for (int n = 0; n < N; n++) {
			if (sc.nextInt() == 1) {
				r++;
				sum += r;
			} else {
				r--;
				sum += r;
			}
		}
		System.out.println(sum);
		
		sc.close();
	}

}