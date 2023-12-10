import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean asc = false;
		boolean des = false;
		int a = sc.nextInt();
		if (a == 1) {
			asc = true;
		} else if (a == 8) {
			des = true;
		} else {
			System.out.println("mixed");
		}
		if (asc || des) {
			int b;
			for (int i = 0; i < 7; i++) {
				b = sc.nextInt();
				if (asc) {
					if (b - a != 1) {
						asc = false;
						break;
					}
				} else {
					if (a - b != 1) {
						des = false;
						break;
					}
				}
				a = b;
			}
			if (asc) System.out.println("ascending");
			else if (des) System.out.println("descending");
			else System.out.println("mixed");
		}

		
		sc.close();
	}

}