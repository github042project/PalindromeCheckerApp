import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase2PalindromeCheckerApp {

    // Stack-based palindrome checker
    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : input.toCharArray()) {
            if (stack.pop() != ch) return false;
        }
        return true;
    }

    // Deque-based palindrome checker
    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Two-pointer palindrome checker
    public static boolean twoPointerPalindrome(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Palindrome Performance Comparison ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Stack approach timing
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long stackTime = System.nanoTime() - startTime;

        // Deque approach timing
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long dequeTime = System.nanoTime() - startTime;

        // Two-pointer approach timing
        startTime = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(input);
        long twoPointerTime = System.nanoTime() - startTime;

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Stack-based: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque-based: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two-pointer: " + twoPointerResult + " | Time: " + twoPointerTime + " ns");

        scanner.close();
    }
}