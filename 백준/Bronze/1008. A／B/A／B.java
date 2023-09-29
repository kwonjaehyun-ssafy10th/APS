import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        double val = (double) A / B;
        DecimalFormat df = new DecimalFormat("0.#########");
        String res = df.format(val);
        System.out.println(res);
    }
}