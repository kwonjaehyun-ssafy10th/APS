import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			Boolean flag = true;
			String word = sc.next();
			for (int i = 0; i < list.size(); i++) {
				String compare = list.get(i);
				if (word.indexOf(compare) == 0) {
					list.remove(compare);
					list.add(word);
					flag = false;
					break;
				} else if (compare.indexOf(word) == 0) {
					flag = false;
					break;
				}
			}
			if (flag) list.add(word);
		}
		System.out.println(list.size());
		
		sc.close();
	}

}