package bai9;

public class Solution {
    public static boolean isPalindrome(int x) {
        int res = 0;
        int temp = x;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (temp < 0) {
            return false;
        }
        return res == temp;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
