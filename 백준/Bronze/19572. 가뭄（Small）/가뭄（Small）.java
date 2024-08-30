import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
		float a = (float) (d1 + d2 - d3) / 2, b = (float) (d1 + d3 - d2) / 2, c = (float) (d2 + d3 - d1) / 2;
		if (0 < a && 0 < b && 0 < c) {
			System.out.println(1);
			System.out.println(a + " " + b + " " + c);
		} else {
			System.out.println(-1);
		}
		
		sc.close();
	}

}