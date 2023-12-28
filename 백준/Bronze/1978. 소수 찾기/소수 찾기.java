import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		for (int n = 0; n < N; n++) {
			int num = sc.nextInt();
			if (num == 1) continue;
			if (isPrime(num)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
	
	static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i < Math.sqrt(n) + 1; i++) {
			if (n % i == 0 && n / i != 1) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}