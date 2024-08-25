import java.util.Scanner;

public class P2001B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            if (n % 2 == 0) {
                System.out.println(-1);
            } else {
                int mid = n/2;
                a[mid] = 1;

                for (int i = 2; i <= n; i++) {
                    if(i%2==0){
                        mid = mid+i-1;
                        a[mid] =i;
                    }else {
                        mid = mid-i+1;
                        a[mid] = i;
                    }
                }
                for(int i =0;i<n;i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}
