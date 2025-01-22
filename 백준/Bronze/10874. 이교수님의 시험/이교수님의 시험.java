import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			int[] arr = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			boolean flag = true;
			for (int i = 0; i < 10; i++) {
				if (arr[i] != i % 5 + 1) {
					flag = false;
					break;
				}
			}
			if (flag) list.add(n + 1);
		}
		for (int n:list) {
			System.out.println(n);
		}
		
		sc.close();
	}

}