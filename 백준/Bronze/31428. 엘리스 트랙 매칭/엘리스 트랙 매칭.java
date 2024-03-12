import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			list.add(sc.next());
		}
		String t = sc.next();
		int cnt = 0;
		for (String string: list) {
			if (string.equals(t)) cnt++;
		}
		System.out.println(cnt);
		
		sc.close();
	}

}
