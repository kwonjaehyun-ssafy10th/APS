import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		List<Integer> first = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			int place = sc.nextInt();
			first.add(place - 1, n + 1);
		}
		List<Integer> second = new ArrayList<>();
		for (int m = 0; m < M; m++) {
			int place = sc.nextInt();
			second.add(place - 1, first.get(M - 1 - m));
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(second.get(i));
		}
		
		sc.close();
	}

}