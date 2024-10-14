import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < 4; i++) {
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					flag = true;
					for (int j = 0; j < 5; j++) {
						System.out.print(arr[j] + " ");
					}
					System.out.println();
				}
			}
		}
		
		sc.close();
	}

}