import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String c = sc.next();
		String p = "";
		for (int i = 0; i < c.length(); i++) {
			int o = (int) c.charAt(i) - 3;
			if (o < 65) o += 26;
			p += (char) o;
		}
		System.out.println(p);
		
		sc.close();
	}

}