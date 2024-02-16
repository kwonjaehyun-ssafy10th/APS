import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<String> fileList = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			fileList.add(sc.next());
		}
		String file = fileList.get(0);
		boolean[] idx = new boolean[file.length()];
		for (int i = 0; i < file.length(); i++) {
			char c = file.charAt(i);
			for (int n = 1; n < N; n++) {
				if (fileList.get(n).charAt(i) != c) {
					idx[i] = true;
					break;
				}
			}
		}
		String ans = "";
		for (int i = 0; i < file.length(); i++) {
			if (idx[i]) {
				ans += "?";
			} else {
				ans += file.charAt(i);
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}