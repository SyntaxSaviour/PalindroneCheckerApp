/**
 * Palindrome Checker App
 * Use Case 1 – Application Entry & Welcome Message
 * Version 1.0
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" Welcome to the Palindrome Checker App ");
        System.out.println(" Version : 1.0 ");
        System.out.println("======================================");

        System.out.println("System initialized successfully.");

        // UC1 – Welcome message
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version 2.0");

        // UC2 – Hardcoded palindrome check
        String word = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("System initialized successfully.");
        if (isPalindrome)
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");
    }
}