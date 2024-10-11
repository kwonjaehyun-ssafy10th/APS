import java.util.Scanner;

public class Main {

	static float[] x;
	static float[] y;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			x = new float[4];
			y = new float[4];
			for (int i = 0; i < 4; i++) {
				x[i] = sc.nextFloat();
				y[i] = sc.nextFloat();
			}
			check(x, y);
		}
		
		sc.close();
	}
	
	static void check(float[] x, float[] y) {
		float a = x[1] - x[0], b = y[1] - y[0], c = x[3] - x[2], d = y[3] - y[2];
		if (a * d - b * c != 0) {
			float r = (d * (x[2] - x[0]) - c * (y[2] - y[0])) / (a * d - b * c);
			System.out.println(String.format("POINT %.2f %.2f", a * r + x[0], b * r + y[0]));
		} else {
			System.out.println(b * (x[2] - x[0]) - a * (y[2] - y[0]) == 0 ? "LINE" : "NONE");
		}
	}

}