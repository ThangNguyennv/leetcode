package topinterview150.ex167;

public class TwoSumIIInputArrayIsSorted {
//    // Solution 01:
//     public int[] twoSum(int[] numbers, int target) {
//        int[] res = new int[2];
//        boolean ok = false;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    res[0] = i + 1;
//                    res[1] = j + 1;
//                    ok = true;
//                }
//            }
//            if (ok) {
//                break;
//            }
//        }
//        return res;
//    }
    // Solution 02:
     public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int total = numbers[left] + numbers[right];
            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total < target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
