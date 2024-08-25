import java.util.*;

public class MADArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Size of the array
            int[] a = new int[n];
            long currentSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                currentSum += a[i];
            }

            long sum = 0;

            while (true) {

                // If all elements are zero, break the loop
                if (currentSum == 0) break;

                // Add the current sum to the total sum
                sum += currentSum;
                currentSum =0;

                // Create a new array b to store MAD values
                int[] b = new int[n];
                Map<Integer, Integer> frequencyMap = new HashMap<>();

                for (int i = 0; i < n; i++) {
                    // Update the frequency map
                    frequencyMap.put(a[i], frequencyMap.getOrDefault(a[i], 0) + 1);

                    // Calculate the MAD value for the subarray [a1, a2, ..., ai]
                    int mad = 0;
                    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                        if (entry.getValue() >= 2) {
                            mad = Math.max(mad, entry.getKey());
                        }
                    }

                    b[i] = mad;
                    currentSum+=b[i];
                }

                // Update the array a with values from b
                a = b;
            }

            // Output the result for the current test case
            System.out.println(sum);
        }

        scanner.close();
    }
}