import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next(), B = sc.next();
		String AM = "", Am = "", BM = "", Bm = "";
		for (int i = 0; i < A.length(); i++) {
			char c = A.charAt(i);
			if (c == '5' || c == '6') {
				AM += '6';
				Am += '5';
			} else {
				AM += c;
				Am += c;
			}
		}
		for (int i = 0; i < B.length(); i++) {
			char c = B.charAt(i);
			if (c == '5' || c == '6') {
				BM += '6';
				Bm += '5';
			} else {
				BM += c;
				Bm += c;
			}
		}
		int M = Integer.parseInt(AM) + Integer.parseInt(BM);
		int m = Integer.parseInt(Am) + Integer.parseInt(Bm);
		System.out.println(m + " " + M);
		
		sc.close();
	}

}