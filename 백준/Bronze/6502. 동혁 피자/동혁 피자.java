import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while (true) {
			float r = sc.nextFloat();
			if (r == 0) break;
			float w = sc.nextFloat(), l = sc.nextFloat();
			if (Math.sqrt(w * w + l * l) <= 2 * r) {
				System.out.println(String.format("Pizza %d fits on the table.", i));
			} else {
				System.out.println(String.format("Pizza %d does not fit on the table.", i));
			}
			i++;
		}
		
		sc.close();
	}

}