//Write a main method to find and display the first 10 square numbers that are greater than Long.MAX_VALUE.

import java.math.BigInteger;

public class Project4 {
    static void multBigInt(long bigLong, int count) {
        if (count < 10) {
            System.out.println(new BigInteger(bigLong + "").multiply(new BigInteger(bigLong + "")));
            multBigInt(++bigLong, ++count);
        }
    }
    public static void main(String[] args) {
        long startingLong = (long)Math.pow((double)Long.MAX_VALUE, 0.5);
        multBigInt(++startingLong, 0);
    }
}
