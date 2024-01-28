import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String line = sc.nextLine();
			if (".".equals(line)) break;
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			for (int i = 0; i < line.length(); i++) {
				Character c = line.charAt(i);
				if (c == '(' || c == '[') {
					stack.add(c);
				} else if (c == ')' || c == ']') {
					if (stack.isEmpty()) {
						flag = false;
						break;
					} else {
						Character s = stack.pop();
						if ((c == ')' && s == '(') || (c == ']' && s == '[')) {
							continue;
						} else {
							flag = false;
							break;
						}
					}
				}
			}
			if (!stack.isEmpty()) flag = false;
			if (flag) System.out.println("yes");
			else System.out.println("no");
		}
		
		sc.close();
	}

}