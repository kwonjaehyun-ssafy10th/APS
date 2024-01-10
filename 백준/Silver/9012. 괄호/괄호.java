import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String str = sc.next();
			Stack<Integer> stack = new Stack<>();
			boolean flag = true;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(') {
					stack.add(0);
				} else {
					if (!stack.isEmpty()) {
						stack.pop();
					} else {
						flag = false;
						break;
					}
				}
			}
			if (stack.isEmpty() && flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}

}