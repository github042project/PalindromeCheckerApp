import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class encapsulates the palindrome logic
class UseCase2PalindromeCheckerApp {

    // Method to check palindrome using Stack
    public boolean checkPalindrome(String input) {

        if (input == null || input.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare characters while popping
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("=== Object-Oriented Palindrome Service ===");
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        boolean result = checker.checkPalindrome(userInput);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}