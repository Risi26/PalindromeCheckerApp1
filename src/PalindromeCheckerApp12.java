public class PalindromeCheckerApp12 {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   PALINDROME CHECKER MANAGEMENT APP   ");
        System.out.println("=======================================");
        System.out.println("Welcome to the Palindrome Checker System!");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("---------------------------------------");

        String text = "madam";   // Hardcoded string
        boolean isPalindrome = true;

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Input String: " + text);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

    }
}

