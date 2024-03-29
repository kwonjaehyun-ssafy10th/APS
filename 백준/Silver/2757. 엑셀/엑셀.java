import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String cell = sc.next();
			if ("R0C0".equals(cell)) break;
			int idx = cell.indexOf('C');
			String row = cell.substring(1, idx);
			int c = Integer.valueOf(cell.substring(idx + 1, cell.length()));
			Stack<Integer> stack = new Stack<>();
			while (0 < c) {
				stack.add((c - 1) % 26);
				c = (c - 1) / 26;
			}
			String col = "";
			while (!stack.isEmpty()) {
				int d = stack.pop();
				col += (char) (d + 65);
			}			
			System.out.println(col + row);			
		}

		sc.close();
	}

}