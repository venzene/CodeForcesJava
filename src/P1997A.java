import java.util.Scanner;

public class P1997A {

    private static int calculateTime(String password) {
        int time = 2;
        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                time += 1;
            } else {
                time += 2;
            }
        }
        return time;
    }

    private static String findMaxTimePassword(String password) {
        int maxTime = -1;
        String bestPassword = password;

        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int pos = 0; pos <= password.length(); pos++) {
                String newPassword = password.substring(0, pos) + letter + password.substring(pos);
                int currentTime = calculateTime(newPassword);
                if (currentTime > maxTime) {
                    maxTime = currentTime;
                    bestPassword = newPassword;
                }
            }
        }
        return bestPassword;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCaseCount; i++) {
            String password = scanner.nextLine();
            System.out.println(findMaxTimePassword(password));
        }

        scanner.close();
    }
}
