package topinterview150.ex172;

import java.util.HashMap;
import java.util.Map;

public class FactorialTrailingZeroes {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int trailingZeroes(int n) {
        int num = factorial(n);
        Map<Character, Integer> map = new HashMap<>();
        String str = num + "";
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        if (map.containsKey('0')) {
            return map.get('0');
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(5));
        System.out.println(factorial(7));
    }
}
