import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		LocalDate date = LocalDate.now();
		ZoneId utcPlus9Zone = ZoneId.of("UTC+9");
		ZonedDateTime utcPlus9DateTime = date.atStartOfDay(utcPlus9Zone);
		
		System.out.println(utcPlus9DateTime.toLocalDate());
	}

}