package topinterview150.ex169;

import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
