import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String f = sc.next();
		String d = sc.next();
		if ((N % 2 == 1 && (XOR(f, d))) || ((N % 2 == 0) && (f.equals(d)))) {
			System.out.println("Deletion succeeded");
		} else {
			System.out.println("Deletion failed");
		}
		sc.close();
	}
	
	static boolean XOR(String a, String b) {
		boolean flag = true;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}