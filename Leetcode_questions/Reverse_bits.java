package Leetcode_questions;

public class Reverse_bits {
    public static void main(String[] args) {
        long n =1010011100;
        System.out.println(reverseBits(n));
    }
    static long reverseBits(long n) {
        long result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }
        return result;
    }
}
