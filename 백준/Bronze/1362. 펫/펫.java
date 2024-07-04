import java.util.Scanner;

public class Main {

	static boolean isAlive = true;
	static int scenario = 1;
	static int w;
	static int o;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String a = sc.next(), b = sc.next();
			if (a.equals("0") && b.equals("0")) break;
			else if (a.equals("#") && b.equals("0")) state();
			else if ((a.equals("E") || a.equals("F"))) {
				if (isAlive) action(a, Integer.valueOf(b));
			}
			else {
				o = Integer.valueOf(a);
				w = Integer.valueOf(b);
				isAlive = true;
			}
		}
		
		sc.close();
	}
	
	static void state() {
		String ans = "";
		if (!isAlive) ans = "RIP";
		else if ((float) 1 / 2 * o < w && w < 2 * o) ans = ":-)";
		else ans = ":-(";
		System.out.println(String.format("%d %s", scenario, ans));
		scenario++;
	}
	
	static void action(String a, int n) {
		if ("E".equals(a)) w -= n;
		else w += n;
		if (w <= 0) isAlive = false;
	}

}