import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long A = sc.nextLong(), B = sc.nextLong();
		while (B != 0) {
			long temp = A;
			A = B;
			B = temp % B;
		}
		for (long i = 0; i < A; i++) {
			bw.write('1');
		}
		
		sc.close();
		bw.flush();
		bw.close();
	}

}