import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int cur = 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if (cur <= num) {
				for (int j = cur; j <= num; j++) {
					stack.push(cur++);
					sb.append("+").append("\n");
				}
				stack.pop();
				sb.append("-").append("\n");
			} else {
				if (stack.pop() == num) {
					sb.append("-").append("\n");
				} else {
					System.out.println("NO");
					flag = false;
					break;
				}
			}
		}
		if (flag) System.out.println(sb);
		
		br.close();
	}

}