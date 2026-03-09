import java.util.Scanner;

public class PalindroneCheckerApp {

    // Node class for Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Convert string to linked list
        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find middle using fast & slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse second half
        Node secondHalf = reverse(slow);

        // Step 4: Compare halves
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean isPalindrome = true;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // Output
        if (isPalindrome)
            System.out.println("Palindrome ✅");
        else
            System.out.println("Not a Palindrome ❌");

        sc.close();
    }
}