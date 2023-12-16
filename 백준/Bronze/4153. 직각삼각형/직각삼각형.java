import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		outer: while (true) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				int num = sc.nextInt();
				if (num == 0) break outer;
				list.add(num);
			}
			int idx = 0;
			for (int i = 1; i < 3; i++) {
				if (list.get(idx) < list.get(i)) {
					idx = i;
				}
			}
			int c = list.remove(idx);
			if (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(c, 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

		sc.close();
	}

}