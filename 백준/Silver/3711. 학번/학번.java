import java.util.BitSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			int G = sc.nextInt();
			int[] arr = new int[G];
			for (int g = 0; g < G; g++) {
				arr[g] = sc.nextInt();
			}
			int m = 1;
			while (true) {
				BitSet vis = new BitSet(m);
				boolean flag = true;
				for (int num:arr) {
					int r = num % m;
					if (vis.get(r)) {
						flag = false;
						break;
					} else {
						vis.set(r);
					}
				}
				if (flag) break;
				m++;
			}
			System.out.println(m);
		}
		
		sc.close();
	}

}