import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String w = sc.next();
		int i = sc.nextInt();
		System.out.println(w.charAt(i - 1));
		
		sc.close();
	}

}