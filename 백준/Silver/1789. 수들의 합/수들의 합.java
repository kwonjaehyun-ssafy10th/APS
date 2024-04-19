import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong();
		long s = 0L;
		long i = 1L;
		while (true) {
			s += i;
			if (S < s) break;
			i++;
		}
		System.out.println(i - 1);
		
		sc.close();
	}

}