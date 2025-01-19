package topinterview150.ex26;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Set<Integer> set = new TreeSet<>();
        for (int x : nums) {
            set.add(x);
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int[] expectedNums = new int[set.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            expectedNums[index++] = entry.getKey();
        }
        for (int i = 0; i < set.size(); i++) {
            nums[i] = expectedNums[i];
        }
        return set.size();
    }
}
