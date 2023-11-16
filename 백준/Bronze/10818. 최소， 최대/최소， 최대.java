import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int n = 0; n < N; n++) {
			int m = sc.nextInt();
			if (m < min) min = m;
			if (max < m) max = m;
		}
		System.out.println(min + " " + max);
		
		sc.close();
	}

}