package topinterview150.ex34;

public class FindFirstandLastPositionofElementinSortedArray {
    public static int firstPos(int[] nums, int left, int right, int target) {
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static int lastPos(int[] nums, int left, int right, int target) {
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static int[] searchRange(int[] nums, int target) {
        int firstPos = firstPos(nums, 0, nums.length - 1, target);
        int lastPos = lastPos(nums, 0, nums.length - 1, target);
        int[] array = new int[2];
        array[0] = firstPos;
        array[1] = lastPos;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] arr = searchRange(nums, 8);
        for (int x : arr) {
            System.out.println(x);
        }

    }
}
