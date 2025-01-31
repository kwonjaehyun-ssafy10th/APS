import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = { 13, 7, 5, 3, 3, 2 };
		int[] a = new int[6], b = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			b[i] = sc.nextInt();
		}
		float c = IntStream.range(0, 6).map(i -> score[i] * a[i]).sum();
		float d = IntStream.range(0, 6).map(i -> score[i] * b[i]).sum() + 1.5f;
		String ans = "cocjr0208";
		if (c < d) ans = "ekwoo";
		System.out.println(ans);
		
		sc.close();
	}

}