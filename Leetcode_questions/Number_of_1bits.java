package Leetcode_questions;

public class Number_of_1bits {
    public static void main(String[] args) {
     int n =15;
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n) {

        int count =0;
        while (n!=0){

            n &=(n-1);
            count++;
        }

        return count;
    }

}
