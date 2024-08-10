import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i < N - 1; i++) {
			cnt += (i - 1) * (N - i - 1); 
		}
		System.out.println(cnt * N / 4);
		
		sc.close();
	}
	
}