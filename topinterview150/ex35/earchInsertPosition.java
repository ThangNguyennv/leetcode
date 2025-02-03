package topinterview150.ex35;

public class earchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int res = -1;
        int left = 0, right = nums.length - 1;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
