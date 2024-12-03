import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r[] = new double[] { 3, 6, 9, 12, 15};
		int[] score = new int[] { 100, 80, 60, 40, 20};
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			double[] x = new double[6];
			double[] y = new double[6];
			for (int i = 0; i < 6; i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			int N = 0, M = 0;
			for (int i = 0; i < 3; i++) {
				double dn = dist(x[i], y[i]), dm = dist(x[i + 3], y[i + 3]);
				for (int j = 0; j < 5; j++) {
					if (dn <= r[j]) {
						N += score[j];
						break;
					}
				}
				for (int j = 0; j < 5; j++) {
					if (dm <= r[j]) {
						M += score[j];
						break;
					}
				}
			}
			String ans = "TIE";
			if (N < M) ans = "PLAYER 2 WINS";
			if (M < N) ans = "PLAYER 1 WINS";
			System.out.println(String.format("SCORE: %d to %d, %s.", N, M, ans));
		}
		
		sc.close();
	}
	
	static double dist(double x, double y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

}