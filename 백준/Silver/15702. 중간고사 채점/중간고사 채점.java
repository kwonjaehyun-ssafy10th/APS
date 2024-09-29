import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[] score = new int[N];
		for (int n = 0; n < N; n++) {
			score[n] = sc.nextInt();
		}
		int winner = -1, highest = -1;
		for (int m = 0; m < M; m++) {
			int total = 0;
			int num = sc.nextInt();
			for (int n = 0; n < N; n++) {
				char c = sc.next().charAt(0);
				if (c == 'O') total += score[n];
			}
			if (highest < total) {
				highest = total;
				winner = num;
			} else if (highest == total && num < winner) {
				winner = num;
			}
		}
		System.out.println(winner + " " + highest);
		
		sc.close();
	}

}