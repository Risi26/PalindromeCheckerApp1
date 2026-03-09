import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


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

        String input = "radar";

        char[] chars = input.toCharArray();

        int start = 0;

        int end = chars.length - 1;

        boolean isPalindrome1 = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        String input1 = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome12 = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        String input2 = "civic";

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack2 = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome3 = true;

        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}




