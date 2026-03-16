import java.util.Stack;


public class PalindromeCheckerApp12{

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Normalize the input (similar to Use Case 10)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Inject the Stack-based strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the algorithm
        boolean result = strategy.isValid(normalized);

        System.out.println("Input : " + input);
        System.out.println("Strategy Used : Stack-based Strategy");
        System.out.println("Is Palindrome? : " + result);
    }
}

interface PalindromeStrategy {
    boolean isValid(String text);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String text) {
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        // Pop and compare with the original string
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}