import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		String c1 = sc.next();
		String c2 = sc.next();
		String c3 = sc.next();
		List<String> list  = Arrays.asList(arr);
		long ans = (list.indexOf(c1) * 10 + list.indexOf(c2)) * (long) Math.pow(10, list.indexOf(c3));
		System.out.println(ans);
		
		sc.close();
	}

}