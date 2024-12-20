package bai1;
import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }
            if (!map.containsKey(nums[i]) || map.get(nums[i]) != i) {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;
        int[] b = twoSum(a, target);
        for (int x : b) {
            System.out.println(x);
        }
    }
}
