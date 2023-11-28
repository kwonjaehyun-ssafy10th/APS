import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 28; i++) {
			list.add(sc.nextInt());
		}
		int[] ans = new int[2];
		int cnt = 0;
		for (int i = 1; i <= 30; i++) {
			if (!list.contains(i)) {
				ans[cnt++] = i;
			}
			if (cnt == 2) break;
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(ans[i]);
		}
		
		sc.close();
	}

}