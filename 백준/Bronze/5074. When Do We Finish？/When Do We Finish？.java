import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String start = sc.next(), duration = sc.next();
			if (start.equals("00:00") && duration.equals("00:00")) break;
			String[] sArr = start.split(":");
			String[] dArr = duration.split(":");
			int sh = Integer.parseInt(sArr[0]), sm = Integer.parseInt(sArr[1]);
			int dh = Integer.parseInt(dArr[0]), dm = Integer.parseInt(dArr[1]);
			int h = sh + dh;
			int m = sm + dm + h * 60;
			h = m / 60;
			m = m % 60;
			int n = h / 24;
			h = h % 24;
			String ans = String.format("%02d:%02d", h, m);
			if (0 < n) ans += String.format(" +%d", n);
			System.out.println(ans);
		}
		
		sc.close();
	}

}