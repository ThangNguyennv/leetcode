package topinterview150.ex27;

import java.util.*;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int x : nums) {
            if (x == val) {
                continue;
            }
            list.add(x);
        }
        int i = 0;
        for (int x : list) {
            nums[i++] = x;
        }
        return list.size();
    }
}
