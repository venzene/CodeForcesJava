import java.util.Scanner;

public class P1984C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long  mn = 0, mx = 0;
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                mn += x;
                mx += x;
                if (mn + mx < 0) {
                    mx = -mn;
                }
            }
            System.out.println(mx);
        }
        sc.close();
    }
}