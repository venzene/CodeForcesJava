import java.util.*;

public class P2003C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine(); // Consume newline
            String s = sc.nextLine();

            // Create a frequency map for characters
            Map<Character, Integer> freqMap = new HashMap<>();
            
            // Count frequency of each character
            for (char c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            // Build the result string
            StringBuilder s1 = new StringBuilder();

            // Iterate while the map is not empty
            while (!freqMap.isEmpty()) {
                // Temporary list to store characters to be removed
                List<Character> toRemove = new ArrayList<>();
                
                for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                    char c = entry.getKey();
                    int count = entry.getValue();
                    
                    // Append the character to the result string
                    s1.append(c);
                    
                    // Decrease its count and remove if zero
                    count--;
                    if (count == 0) {
                        toRemove.add(c);
                    } else {
                        freqMap.put(c, count);
                    }
                }

                // Remove characters with zero count from the map
                for (char c : toRemove) {
                    freqMap.remove(c);
                }
            }

            // Append the result for this test case
            output.append(s1.toString()).append("\n");
        }

        // Output all results
        System.out.print(output.toString());
    }
}
