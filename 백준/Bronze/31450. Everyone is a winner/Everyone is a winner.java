import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(sc.nextInt() % sc.nextInt() == 0 ? "Yes" : "No");
		
		sc.close();
	}

}