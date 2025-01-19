package topinterview150.ex88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] result = new int[m + n];
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i];
                i++;
            } else if (nums1[i] >= nums2[j]) {
                result[k++] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            result[k++] = nums1[i];
            i++;
        }

        while (j < n) {
            result[k++] = nums2[j];
            j++;
        }
        for (int l = 0; l < result.length; l++) {
            nums1[l] = result[l];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
