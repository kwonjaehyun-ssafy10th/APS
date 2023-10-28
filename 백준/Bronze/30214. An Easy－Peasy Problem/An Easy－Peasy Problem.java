import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float s1 = sc.nextFloat(), s2 = sc.nextFloat();
		if (s1 >= s2 / 2) System.out.println("E");
		else System.out.println("H");
		
		sc.close();
	}

}