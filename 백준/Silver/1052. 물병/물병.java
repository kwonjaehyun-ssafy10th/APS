import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), K = sc.nextInt();
		int cnt = 0;
		while (true) {
			if (Integer.bitCount(N) <= K) break;
			N++;
			cnt++;
		}
		System.out.println(cnt);
		
		sc.close();
	}

}