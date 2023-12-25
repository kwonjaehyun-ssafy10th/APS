import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		while (5 <= N) {
			N /= 5;
			cnt += N;
		}
		System.out.println(cnt);
		
		sc.close();
	}

}