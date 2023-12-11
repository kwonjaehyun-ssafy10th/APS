import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			if (!list.contains(a % 42)) {
				list.add(a % 42);
			}
		}
		System.out.println(list.size());
		
		sc.close();
	}

}