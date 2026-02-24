import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase2PalindromeCheckerApp {

    // Method to check palindrome using Queue and Stack
    public static boolean isPalindrome(String input) {

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Add characters to both Stack and Queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        // Compare dequeue (queue) with pop (stack)
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Queue + Stack Based Palindrome Checker ===");
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