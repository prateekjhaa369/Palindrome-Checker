import java.util.*;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (char ch : input.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check for palindrome:");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("✅ The input is a palindrome.");
        } else {
            System.out.println("❌ The input is NOT a palindrome.");
        }

        sc.close();
    }
}
