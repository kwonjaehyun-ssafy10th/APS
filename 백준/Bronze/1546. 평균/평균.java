import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		int max = 0;
		for (int n = 0; n < N; n++) {
			int score = sc.nextInt();
			sum += score;
			if (max < score) max = score;
		}
		System.out.println(((float) sum) / max * 100 / N);
		
		sc.close();
	}

}