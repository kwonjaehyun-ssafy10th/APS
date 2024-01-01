import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int d = 0;
		V -= A;
		d = V / (A - B);
		V -= (A - B) * d;
		V += A;
		while (0 < V) {
			V -= A;
			d += 1;
			if (V <= 0) break;
			V += B;
		}
		System.out.println(d);
		
		sc.close();
	}

}