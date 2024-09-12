import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println((int) Math.pow(2, N) - 1);
		hanoi(N, 1, 3);
		
		sc.close();
		bw.flush();
		bw.close();
	}
	
	static void move(int start, int end) throws IOException {
		bw.write(String.format("%d %d\n", start, end));
	}
	
	static void hanoi(int n, int start, int end) throws IOException {
		if (n < 1) return;
		int temp = 6 - start - end;
		hanoi(n - 1, start, temp);	
		move(start, end);
		hanoi(n - 1, temp, end);
	}

}