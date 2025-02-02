package topinterview150.ex58;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        StringTokenizer st = new StringTokenizer(s, " ");
        List<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list.get(list.size() - 1).length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
