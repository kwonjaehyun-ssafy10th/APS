import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String doc = sc.nextLine();
		String word = sc.nextLine();
		int docLength = doc.length();
		int wordLength = word.length();
		int ans = 0;
		int i = 0;
		while (i <= docLength - wordLength) {
			int idx = doc.indexOf(word, i);
			if (idx == -1) break;
			i = idx + wordLength;
			ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}