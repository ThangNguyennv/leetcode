package topinterview150.ex66;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    // Solution 01:
//    public static int[] plusOne(int[] digits) {
//        String str = "";
//        for (int i = 0; i < digits.length; i++) {
//            str += digits[i];
//        }
//        BigInteger num1 = new BigInteger(str);
//        BigInteger num2 = new BigInteger("1");
//        BigInteger sum = num1.add(num2);
//        String res = "";
//        res += sum;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < res.length(); i++) {
//            list.add(Integer.valueOf(String.valueOf(res.charAt(i))));
//        }
//        int[] ans = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//           ans[i] = list.get(i);
//        }
//        return ans;
//    }

    // Solution 02:
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(plusOne(digits));
    }
}
