import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K1 = sc.nextInt();
		String O1 = sc.next();
		int K2 = sc.nextInt();
		String O2 = sc.next();
		int K3 = sc.nextInt();
		
		int a = oper(oper(K1,  K2,  O1), K3, O2);
		int b = oper(K1, oper(K2,  K3, O2), O1);
		System.out.println(Math.min(a, b));
		System.out.println(Math.max(a, b));
		
		sc.close();
	}
	
	static int oper(int a, int b, String o) {
		if ("+".equals(o)) return a + b;
		if ("-".equals(o)) return a - b;
		if ("*".equals(o)) return a * b;
		if ("/".equals(o)) return a / b;
		return 0;
	}

}