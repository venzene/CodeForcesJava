import java.util.Scanner;

public class P1996A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of legs

            if (n % 4 == 0) {
                // If n is divisible by 4, only cows are needed
                System.out.println(n / 4);
            } else {
                // If n is not divisible by 4
                int legs = n / 4; // Number of cows
                n = n % 4; // Remaining legs that need to be filled with chickens
                int chiclegs = n / 2; // Number of chickens needed to fill the remaining legs
                System.out.println(legs + chiclegs);
            }
        }

        scanner.close();
    }
}
