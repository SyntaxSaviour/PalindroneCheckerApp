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
        /*
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
        */
        // UC3 – Reverse string palindrome check
        String input = "madam";
        String reversed = "";

        // Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare using equals()
        if (input.equals(reversed))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");
    }
}