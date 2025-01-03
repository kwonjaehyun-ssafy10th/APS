import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String c = sc.nextLine();
			if ("*".equals(c)) break;
			boolean flag = true;
			for (int i = 97; i < 123; i++) {
				if (!c.contains((char) i + "")) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
		
		sc.close();
	}

}