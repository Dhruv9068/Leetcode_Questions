package Leetcode_questions;

public class Find_complement {
    public static void main(String[] args) {
        int num =5;
        System.out.println(findComplement(num));
    }
    static int findComplement(int num) {



        int mask =0;
        int m = num;
        while(m !=0){
            mask = mask << 1 | 1;
            m>>=1;
        }

        int reverse = (~num) & mask;
        return reverse;
    }
}
