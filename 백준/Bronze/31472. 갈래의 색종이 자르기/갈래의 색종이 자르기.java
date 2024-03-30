import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
		W *= 2;
		W = (int) Math.sqrt((double) W);
		System.out.println(W * 4);
		
		sc.close();
	}

}