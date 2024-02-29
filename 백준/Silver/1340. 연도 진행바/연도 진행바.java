import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String dateTimeString = sc.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm", Locale.ENGLISH);
		LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);

		long minutesInYear = dateTime.toLocalDate().lengthOfYear() * 24 * 60;
		double percentageOfYear = (double) ((dateTime.getDayOfYear() - 1) * 24 * 60 + dateTime.getHour() * 60
				+ dateTime.getMinute()) / (double) minutesInYear * 100;

		System.out.println(percentageOfYear);

		sc.close();
	}

}