import java.util.*;
public class P2004A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a= new int[n];
            for(int i =0;i<n;i++){
                a[i] = sc.nextInt();
            }
            if(n==2 && a[1]-a[0]>1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
