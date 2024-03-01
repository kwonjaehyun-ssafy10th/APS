import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < num.length(); i++) {
			list.add(num.charAt(i));
		}
		Collections.sort(list, Collections.reverseOrder());
		for (Character i: list) {
			System.out.print(i);
		}
		
		sc.close();
	}

}