import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		while (true) {
			int i = N;
			boolean flag = true;
			while (0 < i) {
				if (i % 10 != 4 && i % 10 != 7) {
					flag = false;
					break;
				}
				i /= 10;
			}
			if (flag) {
				System.out.println(N);
				break;
			}
			N--;
		}
		
		sc.close();
	}

}