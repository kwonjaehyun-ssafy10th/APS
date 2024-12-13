import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt(), B = sc.nextInt();
		int t = R + B;
		for (int i = 1; i < Math.pow((float) t, 0.5) + 1; i++) {
			float j = (float) t / (float) i;
			if (j == (int) j && 2 * (i + j - 2) == R) {
				System.out.println((int) j + " " + i);
				break;
			}
		}
		
		sc.close();
	}

}