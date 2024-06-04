import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			String s = sc.next();
			list.add(s.charAt(0));
		}
		String ans = "PONIX";
		if (list.contains('l') && list.contains('k') && list.contains('p')) {
			ans = "GLOBAL";
		}
		System.out.println(ans);
		
		sc.close();
	}

}