import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), K = sc.nextInt();
		String line = sc.next();
		String[] arr = line.split(",");
		int[] seq = new int[N];
		for (int n = 0; n < N; n++) {
			seq[n] = Integer.parseInt(arr[n]);
		}
		for (int k = 0; k < K; k++) {
			int[] temp = new int[N - 1];
			for (int i = 0; i < N - 1; i++) {
				temp[i] = seq[i + 1] - seq[i];
			}
			seq = temp;
			N--;
		}
		String ans = Arrays.stream(seq).mapToObj(String::valueOf).collect(Collectors.joining(","));
		System.out.println(ans);
		
		sc.close();
	}

}