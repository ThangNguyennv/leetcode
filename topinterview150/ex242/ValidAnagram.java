package topinterview150.ex242;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char x = t.charAt(i);
            map2.put(x, map2.getOrDefault(x, 0) + 1);
            set.add(x);
        }

        if (map1.size() != map2.size()) {
            return false;
        }
        for (Character x : set) {
            if (!map1.containsKey(x) || !map2.containsKey(x) || !map1.get(x).equals(map2.get(x))) {
                return false;
            }
        }
        return true;
    }
}
