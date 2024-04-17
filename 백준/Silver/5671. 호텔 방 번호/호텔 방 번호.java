import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int N = sc.nextInt(), M = sc.nextInt();
			int cnt = 0;
			for (int i = N; i <= M; i++) { 
				boolean flag = true;
				boolean[] check = new boolean[10];
				int j = i;
				while (0 < j) {
					if (check[j % 10]) {
						flag = false;
						break;
					} else {
						check[j % 10] = true;
					}
					j /= 10;
				}
				if (flag) cnt++;
			}
			System.out.println(cnt);
		};
		
		sc.close();
	}

}