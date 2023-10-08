import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		char g = 'F';
		if (a >= 90) g = 'A';
		else if (a >= 80) g = 'B';
		else if (a >= 70) g = 'C';
		else if (a >= 60) g = 'D';
		System.out.println(g);
		
		sc.close();
	}

}