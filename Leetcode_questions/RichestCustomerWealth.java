package Leetcode_questions;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {{2,3,4},{5,6,7},{35,54,0}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        /*
        Integer.MIN_VALUE is a constant in Java representing the smallest possible value that can be stored in an int variable.
        It is equal to -2^31. In other words, it is the most negative integer value that can be represented using 32 bits.
         */
        for(int person =0; person<accounts.length;person++){
              int rowsum=0;
            for (int account=0; account<accounts[person].length;account++){
            rowsum = rowsum + accounts[person][account];
            }
            if(rowsum> ans){
                ans=rowsum;
            }
        }
        return ans;


    }




}
