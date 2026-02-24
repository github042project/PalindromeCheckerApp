import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {

    // Method to normalize string and check palindrome
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string (remove spaces, make lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer technique
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.print("Enter a string: ");

        String userInput = scanner.nextLine();

        boolean result = isPalindrome(userInput);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}