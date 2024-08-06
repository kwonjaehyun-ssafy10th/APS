import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] big5 = new int[5];
		int[] index5 = new int[5];
		for (int i = 0; i < 8; i++) {
			int a = sc.nextInt();
			for (int j = 0; j < 5; j++) {
				if (big5[j] < a) {
					int[] temp = new int[5];
					for (int k = 0; k < j; k++) {
						temp[k] = big5[k];
					}
					temp[j] = a;
					for (int k = j + 1; k < 5; k++) {
						temp[k] = big5[k - 1];
					}
					big5 = temp;
					int[] temp2 = new int[5];
					for (int k = 0; k < j; k++) {
						temp2[k] = index5[k];
					}
					temp2[j] = i;
					for (int k = j + 1; k < 5; k++) {
						temp2[k] = index5[k - 1];
					}
					index5 = temp2;
					break;
				}
			}
		}
		System.out.println(IntStream.of(big5).sum());
		Arrays.sort(index5);
		for (int i: index5) {
			System.out.print(String.format("%d ", i + 1));
		}
		
		
		sc.close();
	}

}