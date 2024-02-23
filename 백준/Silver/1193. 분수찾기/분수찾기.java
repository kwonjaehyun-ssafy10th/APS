import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int a = 1;
		int b = 1;
		int i = 1;
		boolean flag = true;
		while (i < X) {
			if (flag) {
				if (a == 1) {
					flag = !flag;
					b++;
					i++;
					continue;
				}
				a--;
				b++;
			} else {
				if (b == 1) {
					flag = !flag;
					a++;
					i++;
					continue;
				}
				a++;
				b--;
			}
			i++;
		}
		System.out.println(a + "/" + b);
		
		sc.close();
	}

}