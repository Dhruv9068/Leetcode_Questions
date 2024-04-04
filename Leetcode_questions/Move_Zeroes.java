package Leetcode_questions;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void moveZeroes(int[] arr) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }

        while(count<arr.length){
            arr[count++]=0;
        }
    }
}
