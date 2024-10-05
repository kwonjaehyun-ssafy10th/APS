import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		System.out.println(m * k + m);
		
		sc.close();
	}

}