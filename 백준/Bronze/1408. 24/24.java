import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String time1 = sc.next();
		String time2 = sc.next();
		solution(time1, time2);
		
		sc.close();
	}
	
	static int toSeconds(String time) {
		String[] t = time.split(":");
		int h = Integer.parseInt(t[0]);
		int m = Integer.parseInt(t[1]);
		int s = Integer.parseInt(t[2]);
		int seconds = h * 3600 + m * 60 + s;
		return seconds;
	}
	
	static int timeDiff(int second1, int second2) {
		int diff = (second2 - second1) % (24 * 3600);
        if (diff < 0) diff += 24 * 3600;
		return diff;
	}
	
	static String toHHMMSS(int second) {
		int h = second / 3600;
		int m = (second % 3600) / 60;
		int s = second % 60;
		return String.format("%02d:%02d:%02d", h, m, s);
	}
	
	static void solution(String time1, String time2) {
		int second1 = toSeconds(time1);
		int second2 = toSeconds(time2);
		int diff = timeDiff(second1, second2);
		String ans = toHHMMSS(diff);
		System.out.println(ans);
	}

}