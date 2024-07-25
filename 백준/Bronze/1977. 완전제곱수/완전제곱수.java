import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = 0;
		boolean flag = true;
		for (int i = M; i <= N; i++) {
			if (Math.sqrt(i) == (int) Math.sqrt(i)) {
				if (flag) {
					min = i;
					flag = false;
				}
				sum += i;
			}
		}
		if (flag) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}

}