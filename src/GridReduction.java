import java.util.Scanner;

public class GridReduction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); 
        scanner.nextLine();
        
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int k = scanner.nextInt(); 
            
            int[][] grid = new int[n][n];
            
          
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = scanner.nextInt(); 
                }
            }
            
          
            int reducedSize = n / k;
            
           
            for (int i = 0; i < reducedSize; i++) {
                for (int j = 0; j < reducedSize; j++) {
                    System.out.print(grid[i * k][j * k]);
                }
                System.out.println();
            }
            
        }
        
        scanner.close();
    }
}
