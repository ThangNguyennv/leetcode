package topinterview150.ex290;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean solution(String pattern, String s) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        String[] str1 = pattern.split("");
        String[] str2 = s.split(" ");

        if (str1.length != str2.length) {
            return false;
        }
        for (int i = 0; i < str1.length; i++) {
            String c = str1[i];
            String word = str2[i];

            if (map1.containsKey(c)) {
                if (!map1.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (map2.containsKey(word)) {
                    return false;
                }
                map1.put(c, word);
                map2.put(word, c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("abba", "dog cat cat dog"));
//        solution("abba", "dog cat cat dog");

    }
}
