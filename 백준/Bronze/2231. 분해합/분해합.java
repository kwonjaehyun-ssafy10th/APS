import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean flag = true;
		for (int i = 1; i <= N; i++) {
			int num = i;
			int sum = num;
			while (0 < num) {
				sum += num % 10;
				num /= 10;
			}
			if (sum == N) {
				System.out.println(i);
				flag = false;
				break;
			}
		}
		if (flag) System.out.println(0);
		
		
		sc.close();
	}

}