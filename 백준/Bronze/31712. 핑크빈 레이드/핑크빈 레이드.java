import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] C = new int[3];
		int[] D = new int[3];
		for (int i = 0; i < 3; i++) {
			C[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		int H = sc.nextInt();
		int t = 0;
		while (true) {
			for (int i = 0; i < 3; i++) {
				if (t % C[i] == 0) {
					H -= D[i];
				}
			}
			if (H <= 0) {
				break;
			}
			t++;
		}
		System.out.println(t);
		
		sc.close();	
	}

}