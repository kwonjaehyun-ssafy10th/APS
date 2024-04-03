import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt(), H = sc.nextInt(), W = sc.nextInt();
		double x = Math.sqrt((double) (D * D) / (double) (H * H + W * W));
		int h = (int) (H * x);
		int w = (int) (W * x);
		System.out.println(h + " " + w);
		
		sc.close();
	}

}