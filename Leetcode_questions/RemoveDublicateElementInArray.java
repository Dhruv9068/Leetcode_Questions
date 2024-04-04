package Leetcode_questions;

public class RemoveDublicateElementInArray {
    public static void main(String[] args) {
        int [] nums = { 1,1,2,3,4,4,5};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int a=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=nums[a]){
                a++;
                nums[a]=nums[i];

            }
        }
        return a+1;
    }
}
