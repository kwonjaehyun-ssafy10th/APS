import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if (45 <= M) M -= 45;
		else {
			M += 15;
			H = H > 0 ? H - 1 : 23;
		}
		
		System.out.printf("%d %d", H, M);
		
		sc.close();
	}

}