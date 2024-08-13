import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();
			int p1 = (x2 - x1) * (y2 - y1);
			int p2 = (Math.max(x1, (Math.min(x4, x2))) - Math.min(x2, Math.max(x3, x1))) * (Math.max(y1, Math.min(y4, y2)) - Math.min(y2, Math.max(y3, y1)));
			System.out.println(p1 - p2);
		}
		
		sc.close();
	}

}