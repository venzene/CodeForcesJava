import java.util.*;

public class P2001A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int[] a = new int[n];
            Map<Integer, Integer> frequency = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                frequency.put(a[i], frequency.getOrDefault(a[i], 0) + 1);
            }
            
            int maxF = Collections.max(frequency.values());

            System.out.println(n - maxF);
        }
        scanner.close();
    }
}
