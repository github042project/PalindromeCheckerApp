import java.util.Scanner;
import java.util.Stack;

public class UseCase2PalindromeCheckerApp {

    // Method to check palindrome using Stack
    public static boolean isPalindrome(String input) {

        // Create a stack of characters
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Build reversed string using pop operation
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Stack Based Palindrome Checker ===");
        System.out.print("Enter a string: ");

        String userInput = scanner.nextLine();

        // Check palindrome
        boolean result = isPalindrome(userInput);

        // Print result
        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}