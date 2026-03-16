
public class PalindromeCheckerApp12 {


    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Create an instance of the service
        PalindromeService service = new PalindromeService();

        // Use the service to check the palindrome
        boolean result = service.checkPalindrome(input);

        // Output results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


class PalindromeService {

    public boolean checkPalindrome(String input) {
        // Normalization (as established in previous use cases)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize pointers from hint
        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // Is a palindrome
    }
}