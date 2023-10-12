import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		int a = 0;
		if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) a = 1;
		System.out.println(a);
		
		sc.close();
	}

}