import java.util.Scanner;

public class P2002A {

    public static int minColorsNeeded(int n, int m, int k) {
        if (k > n && k > m) {
            return n * m;
        }

        if (k > n) {
            return k*n;
        }
        if (k > m) {
            return  k*m;
        }
        return (k*k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        int[] results = new int[t];
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            results[i] = minColorsNeeded(n, m, k);
        }

        for (int result : results) {
            System.out.println(result);
        }
        
        scanner.close();
    }
}
