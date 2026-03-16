
public class PalindromeCheckerApp12 {


    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Palindrome Check using the hint logic
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // Output Results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}