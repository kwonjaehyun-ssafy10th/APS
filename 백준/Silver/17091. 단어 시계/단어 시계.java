import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(), m = sc.nextInt();
		String[] hourArr = { null, "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "one" };
		String[] minArr = { null, "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty" };
		String hour = hourArr[h];
		String minute = "";
		String ans = "";
		if (m == 0) {
			ans = String.format("%s o' clock", hour);
		} else if (m <= 30) {
			if (m <= 20) {
				minute = minArr[m];
			} else if (m < 30) {
				minute = "twenty " + minArr[m % 10];
			}
			minute += " minute";
			if (1 < m && m % 15 != 0) {
				minute += "s";
			}
			if (m == 15) {
				minute = "quarter";
			} else if (m == 30) {
				minute = "half";
			}
			ans = String.format("%s past %s", minute, hour);
		} else {
			hour = hourArr[h + 1];
			m = 60 - m;
			if (m <= 20) {
				minute = minArr[m];
			} else {
				minute = "twenty " + minArr[m % 10];
			}
			minute += " minute";
			if (1 < m && m % 15 != 0) {
				minute += "s";
			}
			if (m == 15) {
				minute = "quarter";
			}
			ans = String.format("%s to %s", minute, hour);
		}
		System.out.println(ans);
		
		sc.close();
	}

}