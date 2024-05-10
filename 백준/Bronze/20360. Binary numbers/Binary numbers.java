import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String bin = Integer.toBinaryString(n);
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(bin.length() - 1  - i) == '1') {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}

}