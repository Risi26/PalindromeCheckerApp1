import java.util.*;

public class PalindromeCheckerApp12 {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   PALINDROME CHECKER MANAGEMENT APP   ");
        System.out.println("=======================================");

        // Method 1: Two pointer method
        String text = "madam";
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
        System.out.println("Result: " + (isPalindrome ? "Palindrome" : "Not Palindrome"));

        // Method 2: Using char array
        String input = "radar";
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome1 = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome1 = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("\"" + input + "\" is " + (isPalindrome1 ? "Palindrome" : "Not Palindrome"));

        // Method 3: Using Stack
        String input1 = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input1.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome2 = true;

        for (char c : input1.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome2 = false;
                break;
            }
        }

        System.out.println("\"" + input1 + "\" is " + (isPalindrome2 ? "Palindrome" : "Not Palindrome"));

        // Method 4: Queue + Stack
        String input2 = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : input2.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean isPalindrome3 = true;

        while (!queue.isEmpty()) {
            if (queue.poll() != stack2.pop()) {
                isPalindrome3 = false;
                break;
            }
        }

        System.out.println("\"" + input2 + "\" is " + (isPalindrome3 ? "Palindrome" : "Not Palindrome"));

        // Method 5: Deque
        String input3 = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input3.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome4 = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome4 = false;
                break;
            }
        }

        System.out.println("\"" + input3 + "\" is " + (isPalindrome4 ? "Palindrome" : "Not Palindrome"));

        // Method 6: LinkedList with user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for (char c : userInput.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome5 = true;

        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome5 = false;
                break;
            }
        }

        System.out.println("User input is " + (isPalindrome5 ? "Palindrome" : "Not Palindrome"));

        // Method 7: Recursive
        String input4 = "racecar";

        boolean isPalindrome6 = check(input4, 0, input4.length() - 1);

        System.out.println("\"" + input4 + "\" is " + (isPalindrome6 ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }

    // Recursive method
    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}