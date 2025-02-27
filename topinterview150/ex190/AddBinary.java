package topinterview150.ex190;

import java.math.BigInteger;

public class AddBinary {
    public static String addBinary(String a, String b) {
        BigInteger b1 = new BigInteger(a);
        String s1 = b1.toString(10);
        BigInteger num1 = new BigInteger(String.valueOf(s1));

        BigInteger b2 = new BigInteger(b);
        String s2 = b2.toString(10);
        BigInteger num2 = new BigInteger(String.valueOf(s2));

        BigInteger sum = num1.add(num2);
        BigInteger b4 = new BigInteger(String.valueOf(sum));
        return b4.toString(2);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
