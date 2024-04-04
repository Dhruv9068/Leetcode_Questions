package Leetcode_questions;

public class ReversInteger {
    public static void main(String[] args) {
        int x =-12345;
        int y = 456;
        System.out.println(reverse(x));
        System.out.println(reverse(y));
    }

    static int reverse(int x) {
        int ans = 0;
        int MAX_INT = Integer.MAX_VALUE;
        int MIN_INT = Integer.MIN_VALUE;


        while (x != 0) {

            if (ans > MAX_INT / 10 || ans < MIN_INT / 10) {
                return 0;
            }

            int rem = x % 10;
            x = x / 10;

            ans = ans * 10 + rem;
        }

        return ans;
    }
}
