import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			list.add(sc.nextInt());
		}
		list.sort(null);
		int ans;
		if (N % 2 == 0) {
			ans = list.get(0) * list.get(N - 1);
		} else {
			int num = list.get(N / 2);
			ans = num * num;
		}
		System.out.println(ans);
		
		sc.close();
	}

}