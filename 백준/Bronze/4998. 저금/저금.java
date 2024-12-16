import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			double N = sc.nextDouble(), B = sc.nextDouble(), M = sc.nextDouble();
			Long i = 0L;
			while (N <= M) {
				N *= (1 + B / 100);
				i++;
			}
			System.out.println(i);
		}
	
	}

}