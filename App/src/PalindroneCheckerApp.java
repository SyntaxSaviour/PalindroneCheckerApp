import java.util.Scanner;

// Main Application Class
public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Palindrome Checker App (OOP Version) ===");

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object of service class
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result)
            System.out.println("Result: Palindrome");
        else
            System.out.println("Result: Not a Palindrome");
    }
}

// Service class containing palindrome logic
class PalindromeService {

    public boolean checkPalindrome(String input) {

        // remove spaces + ignore case
        input = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}