import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String line = sc.nextLine();
			if (line.equals("#")) break;
			int sum = 0;
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c == ' ') continue;
				else sum += ((int) c - 64) * (i + 1);
			}
			System.out.println(sum);
		}
		
		sc.close();
	}

}