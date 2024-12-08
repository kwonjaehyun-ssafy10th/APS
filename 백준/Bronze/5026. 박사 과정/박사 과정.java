import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			String p = sc.next();
			if (p.equals("P=NP")) System.out.println("skipped");
			else {
				String[] nums = p.split("\\+");
				System.out.println(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
			}			
		}
		
		sc.close();
	}

}