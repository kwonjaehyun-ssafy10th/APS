import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean flag = true;
		for (int i = 0; i < 3; i++) {
			List<Integer> list = new ArrayList<>();
			for (int n = 0; n < N; n++) {
				list.add(sc.nextInt());
			}
			if (!list.contains(7)) {
				flag = false;
				break;
			}
		}
		int ans = 0;
		if (flag) ans = 777;
		System.out.println(ans);
		
		sc.close();
	}

}