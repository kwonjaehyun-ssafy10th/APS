import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		String target = "UCPC";
		String ans = "love";
		int idx = -1;
		for (int i = 0; i < 4; i++) {
			idx = string.indexOf(target.charAt(i), idx + 1);
			if (idx == -1) {
				ans = "hate";
				break;
			}
		}
		System.out.println("I " + ans + " UCPC");		
		
		sc.close();
	}

}