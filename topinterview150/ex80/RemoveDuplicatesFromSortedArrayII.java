package topinterview150.ex80;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArrayII {
    public static void removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int len = 0;
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                len++;
            } else if (entry.getValue() >= 2) {
                len += 2;
            }
        }
        int[] expectedNums = new int[len];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                for (int j = 0; j < 2; j++) {
                    expectedNums[index++] = entry.getKey();
                }
            } else if (entry.getValue() == 1) {
                expectedNums[index++] = entry.getKey();
            }
        }
        nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = expectedNums[i];
        }
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        removeDuplicates(nums1);
        System.out.println();
        removeDuplicates(nums2);
    }
}
