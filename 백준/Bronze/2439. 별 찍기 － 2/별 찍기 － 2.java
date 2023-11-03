import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        for (int n = 0; n < N; n++) {
            for (int i = 0; i < N - 1 - n; i++) {
                System.out.print(" ");                
            }
            for (int i = 0; i < n + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}