import java.util.Scanner;
 
public class Main {
    public static int N;
    public static int ans;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        N = sc.nextInt();
        ans = 0;
        int[] pos = new int[N];
        recur(0, pos);
             
        System.out.println(ans);

        sc.close();
    }
     
    public static void recur(int r, int[] pos) {
        if (r == N) {
            ans++;
            return;
        }
         
        for (int i = 0; i < N; i++) {
            if (check(r, i, pos)) {
                pos[r] = i;
                recur(r + 1, pos);
            }
        }
        return;
    }
     
    public static boolean check(int r, int c, int[] pos) {
        for (int i = 0; i < r; i++) {
            if(pos[i] == c || i - r == pos[i] - c || i - r == c - pos[i])
                return false;
        }
        return true;
    }
 
}