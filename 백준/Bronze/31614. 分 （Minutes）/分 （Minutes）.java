import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(H * 60 + M);
		
		sc.close();
	}

}