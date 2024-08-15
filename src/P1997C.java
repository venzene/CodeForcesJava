import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Scanner;

public class P1997C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            
            Stack<Integer> stack = new Stack<>();
            StringBuilder result = new StringBuilder();
            int bracket = 0;
            
            // Lists to keep track of indices
            List<Integer> openingIndices = new ArrayList<>();
            List<Integer> closingIndices = new ArrayList<>();
            
            // Fill the string and track indices
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                
                if (ch == '(') {
                    stack.push(i);
                    bracket++;
                    openingIndices.add(i);
                    result.append(ch);
                } else if (ch == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                        bracket--;
                    }
                    closingIndices.add(i);
                    result.append(ch);
                } else if (ch == '_') {
                    if (bracket > 0) {
                        result.append(')');
                        closingIndices.add(i);
                        bracket--;
                    } else {
                        result.append('(');
                        stack.push(i);
                        openingIndices.add(i);
                        bracket++;
                    }
                }
            }
            
            // Calculate the cost
            int sumOpening = 0;
            int sumClosing = 0;
            
            for (int index : openingIndices) {
                sumOpening += index;
            }
            
            for (int index : closingIndices) {
                sumClosing += index;
            }
            
            int cost = sumClosing - sumOpening;
            
            System.out.println(cost);
        }
        
        scanner.close();
    }
}
