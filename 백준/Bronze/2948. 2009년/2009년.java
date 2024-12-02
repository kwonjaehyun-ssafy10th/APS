import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt(), M = sc.nextInt();
		LocalDate date = LocalDate.of(2009, M, D);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		String day = dayOfWeek.toString();
		String ans = day.substring(0, 1) + day.substring(1).toLowerCase();
		System.out.println(ans);
		
		sc.close();
	}

}