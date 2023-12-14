import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int H = sc.nextInt(), W = sc.nextInt(), N = sc.nextInt();
			N--;
			int floor = N % H + 1;
			int unit = N / H + 1;
			System.out.println(String.format("%d%02d", floor, unit));
		}
		
		sc.close();
	}

}