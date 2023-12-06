import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		System.out.println(oper(A, B));
		
		sc.close();
	}
	
	static long oper(int a, int b) {
		return (long) (a + b) * (a - b);
	}

}