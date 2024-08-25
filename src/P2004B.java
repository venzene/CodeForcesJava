import java.util.Scanner;

public class P2004B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();

            int result;
            int il = Math.max(l, L);
            int ir = Math.min(r, R);

            if (il > ir) {
                result = 1;
            }
            else {
                result = ir - il;

                if (Math.min(l,L) < il) {
                    result++;
                }
                if (Math.max(r,R) > ir) {
                    result++;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}
