import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int br = sc.nextInt(), bc = sc.nextInt();
		int dr = sc.nextInt(), dc = sc.nextInt();
		int jr = sc.nextInt(), jc = sc.nextInt();
		int bd = Math.max(Math.abs(br - jr), Math.abs(bc - jc));
		int dd = Math.abs(dr - jr) + Math.abs(dc - jc);
		if (bd < dd) System.out.println("bessie");
		else if (dd < bd) System.out.println("daisy");
		else System.out.println("tie");
		
		sc.close();
	}

}