import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int total = 64;
		int min = 64;
		int cnt = 1;
		while (true) {
			if (total == X) break;
			min /= 2;
			cnt++;
			if (X <= total - min) {
				cnt--;
				total -= min;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}

}