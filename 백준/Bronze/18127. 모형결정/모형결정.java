import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		int i = 0;
		int j = 2;
		long cnt = 1L;
		while (i < B) {
			cnt += (A - 2) * j - (A - 3);
			i++;
			j++;
		}
		System.out.println(cnt);
		
		sc.close();
	}

}