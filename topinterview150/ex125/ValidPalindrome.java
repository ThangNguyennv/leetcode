package topinterview150.ex125;

import java.util.*;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.trim();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                list.add(c);
            }
        }
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (char x : list) {
            stack.push(Character.toLowerCase(x));
            queue.add(Character.toLowerCase(x));
        }
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}
