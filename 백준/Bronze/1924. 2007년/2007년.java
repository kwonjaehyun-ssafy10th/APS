import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] days = new int[] { 0, 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
		for (int i = 3; i < 13; i++) {
			days[i] = days[i - 1] + days[i];
		}
		int x = sc.nextInt(), y = sc.nextInt();
		String[] weekday = new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		String ans = weekday[(days[x] + y) % 7];
		System.out.println(ans);
		
		sc.close();
	}

}