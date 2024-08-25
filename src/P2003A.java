import java.util.Scanner;

public class P2003A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            String s = sc.next(); 

            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    allSame = false;
                    break;
                }
            }
            
            if (allSame || s.charAt(0) == s.charAt(n - 1)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
