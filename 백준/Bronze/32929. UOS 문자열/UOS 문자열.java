import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "UOS";
		int x = sc.nextInt();
		System.out.println(s.charAt((x - 1) % 3));
		
		sc.close();
	}

}