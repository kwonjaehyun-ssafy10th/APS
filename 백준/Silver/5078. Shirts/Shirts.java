import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Character> priorityOrder = Arrays.asList('S', 'M', 'L');
		
		while (true) {
			int W = sc.nextInt();
			if (W == 0) break;
			List<String> list = new ArrayList<>();
			for (int w = 0; w < W; w++) {
				list.add(sc.next());
			}
			int H = sc.nextInt();
			for (int h = 0; h < H; h++) {
				list.add(sc.next());
			}
			list.sort((s1, s2) -> {
				int firstComparison = Integer.compare(
						priorityOrder.indexOf(s1.charAt(0)),
						priorityOrder.indexOf(s2.charAt(0))
				);
				if (firstComparison != 0) {
					return firstComparison;
				}
				return Character.compare(s1.charAt(1), s2.charAt(1));
			});
			for (String shirt:list) {
				System.out.print(shirt + " ");
			}
			System.out.println();
				
		}
		
		sc.close();
	}

}