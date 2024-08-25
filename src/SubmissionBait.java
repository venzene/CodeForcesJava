import java.util.Arrays;
import java.util.Scanner;

public class SubmissionBait {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt(); // Size of the array
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Sort the array in descending order
            Arrays.sort(a, (x, y) -> y - x);

            // Alice's turn (she starts the game)
            boolean aliceTurn = true;
            int mx = 0;

            // Iterate through the sorted array
            for (int i = 0; i < n; i++) {
                if (a[i] >= mx) {
                    mx = a[i];
                } else {
                    break;
                }
                a[i] = 0; // Set the chosen element to 0
                aliceTurn = !aliceTurn; // Switch turns
            }

            // If we finish the loop without breaking, it means all elements were valid moves
            if (aliceTurn) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}
