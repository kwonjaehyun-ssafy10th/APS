import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<String[]> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String day = sc.next();
			String month = sc.next();
			String year = sc.next();
			day = String.format("%02d", Integer.parseInt(day));
			month = String.format("%02d", Integer.parseInt(month));
			String[] arr = { year + month + day, name };
			list.add(arr);
		}
		list.sort(Comparator.comparing(arr -> arr[0]));
		
		System.out.println(list.get(n - 1)[1]);
		System.out.println(list.get(0)[1]);
		
		sc.close();
	}

}