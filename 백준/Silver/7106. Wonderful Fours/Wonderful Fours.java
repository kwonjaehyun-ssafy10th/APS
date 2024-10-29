import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();
        }
        List<String> K5 = Arrays.asList(arr);
        Set<Integer> set = new HashSet<>();

        generatePermutations(K5, "", set);
        int ans = countValidCombinations(set);

        System.out.println(ans);
        sc.close();
    }

    static void generatePermutations(List<String> elements, String current, Set<Integer> set) {
        if (elements.isEmpty()) {
            if (!current.startsWith("0")) {
                set.add(Integer.parseInt(current));
            }
            return;
        }
        for (int i = 0; i < elements.size(); i++) {
            List<String> remaining = new ArrayList<>(elements);
            remaining.remove(i);
            generatePermutations(remaining, current + elements.get(i), set);
        }
    }

    static int countValidCombinations(Set<Integer> elements) {
        List<Integer> elementList = new ArrayList<>(elements);
        int count = 0;
        int n = elementList.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (l != i && l != j && l != k) {
                            int a = elementList.get(i);
                            int b = elementList.get(j);
                            int c = elementList.get(k);
                            int d = elementList.get(l);
                            if (a + b + c == d) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
