import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase2PalindromeCheckerApp {

    // Method to check palindrome using Deque
    public static boolean isPalindrome(String input) {

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear characters
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Deque Based Optimized Palindrome Checker ===");
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