import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), C = sc.nextInt();
		int[] arr = new int[C + 1];
		for (int n = 0; n < N; n++) {
			int p = sc.nextInt();
			for (int i = p; i <= C; i += p) {
				arr[i] = 1;
			}
		}
		System.out.println(IntStream.of(arr).sum());
		
		sc.close();
	}

}