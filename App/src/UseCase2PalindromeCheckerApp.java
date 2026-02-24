import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String input, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive call for next inner substring
        return isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Recursive Palindrome Checker ===");
        System.out.print("Enter a string: ");

        String userInput = scanner.nextLine();

        boolean result = isPalindrome(userInput, 0, userInput.length() - 1);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}