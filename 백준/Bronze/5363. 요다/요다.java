import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		int N = sc.nextInt();
		sc.nextLine();
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(sc.nextLine());
			List<String> list = new ArrayList<>();
			while (st.hasMoreTokens()) {
				list.add(st.nextToken());
			}
			for (int i = 2; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println(list.get(0) + " " + list.get(1));
		}
		
		sc.close();
	}

}