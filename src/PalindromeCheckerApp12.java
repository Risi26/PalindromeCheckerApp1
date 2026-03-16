import java.util.Stack;

public class PalindromeCheckerApp12 {

    /**
     * Application entry point for UC13.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        // Normalize input for accurate checking
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Using the Stack-based strategy from previous use case
        PalindromeStrategy strategy = new StackStrategy();

        // Capture Start Time in nanoseconds
        long startTime = System.nanoTime();

        // Execute algorithm
        boolean isPalindrome = strategy.isValid(normalized);

        // Capture End Time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

/**
 * Interface for the Strategy Pattern.
 */
interface PalindromeStrategy {
    boolean isValid(String text);
}

/**
 * Concrete implementation using a Stack.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            stack.push(c);
        }
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}