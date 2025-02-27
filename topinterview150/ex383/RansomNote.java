package topinterview150.ex383;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomNote {
    public static int canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char x = ransomNote.charAt(i);
            if (map1.containsKey(x)) {
                map1.put(x, map1.get(x) + 1);
            } else {
                map1.put(x, 1);
            }
            set.add(x);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char x = magazine.charAt(i);
            if (map2.containsKey(x)) {
                map2.put(x, map2.get(x) + 1);
            } else {
                map2.put(x, 1);
            }
        }
        int count = 0;

        for (int i = 0; i < set.size(); i++) {
            char x = ransomNote.charAt(i);
            if (map1.containsKey(x) && map2.containsKey(x)) {
                if (map1.get(x) <= (map2.get(x))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));

    }
}
