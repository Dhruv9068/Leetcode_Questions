package Leetcode_questions;

public class AvalidPerfectSqaure {
    public static void main(String[] args) {
      int num = 14;
      System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        long S = 1;
        long E = num;
        while (S <= E) {
            long mid = S + (E - S) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                S = mid + 1;
            } else {
                E = mid - 1;
            }
        }
        return false;
    }
}
