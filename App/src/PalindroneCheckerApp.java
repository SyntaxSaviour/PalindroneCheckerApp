public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // UC1 – Welcome message
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version 4.0");

        // UC4 – Character Array Palindrome Check
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}