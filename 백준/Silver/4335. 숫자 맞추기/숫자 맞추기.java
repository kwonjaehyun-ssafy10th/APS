import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int g = sc.nextInt();
			sc.nextLine();
			if (g == 0) break;
			int[] num = new int[11];
			for (int i = 1; i < 11; i++) {
				num[i] = 1;
			}
			int l = 1, h = 11;
			while (true) {
				String ans = sc.nextLine();
				if (ans.equals("too high")) {
					for (int i = g; i < h; i++) {
						num[i] = 0;
					}
					h = g;
				} else if (ans.equals("too low")) {
					for (int i = l; i <= g; i++) {
						num[i] = 0;
					}
					l = g + 1;
				} else {
					if (0 < IntStream.of(num).sum() && num[g] == 1) {
						System.out.println("Stan may be honest");
					} else {
						System.out.println("Stan is dishonest");
					}
					break;
				}
				g = sc.nextInt();
				sc.nextLine();
			}
		}
		
		sc.close();
	}

}