import java.util.Arrays;
import java.util.Scanner;

public class P2003B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int result;
            if (n % 2 == 1) {
                result = arr[n / 2];
            } else {
                result = Math.max(arr[n / 2 - 1], arr[n / 2]);
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}
