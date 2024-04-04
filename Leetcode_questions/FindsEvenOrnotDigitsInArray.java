package Leetcode_questions;

public class FindsEvenOrnotDigitsInArray {
    public static void main(String[] args) {
        int[]nums = {55,455,65444,55};
        System.out.println(findNumbers(nums));


    }
    static int findNumbers(int[] nums){
        int count=0;
        for (int num:nums){
            if (CheckdigitEven(num))
            count++;


        }
        return count;


    }

    static boolean CheckdigitEven(int  num){
        int numsofdigit =digits(num);
        return numsofdigit%2==0;
    }
    static int digits (int nums){
        int count =0;
        while(nums>0){
            count++;
            nums/=10;
        }
        return count;
    }
}
