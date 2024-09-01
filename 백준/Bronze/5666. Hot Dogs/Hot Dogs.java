import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			float H = sc.nextFloat(), P = sc.nextFloat();
			System.out.println(String.format("%.2f", H / P));
		}
		
		sc.close();
	}

}