public class Main {

	static String digits = "0123456789abcdef";
	
	public static void main(String[] args) {
		
		for (int i = 1000; i < 10000; i++) {
			String dc = String.valueOf(i);
			String dz = Integer.toString(i, 12);
			String hx = Integer.toString(i, 16);
			int x = digitSum(dc), y = digitSum(dz), z = digitSum(hx);
			if (x == y && y == z) System.out.println(i);
		}
	}
	
	static int digitSum(String num) {
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += digits.indexOf(num.charAt(i));
		}
		return sum;
	}

}