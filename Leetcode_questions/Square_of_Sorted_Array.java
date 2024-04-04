package Leetcode_questions;

import java.util.Arrays;

public class Square_of_Sorted_Array {
    public static void main(String[] args) {
      int [] nums  = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = nums[i] * nums[i];
//         }

//         // Sort the squared array
//         Arrays.sort(nums);
//         return nums;




        // 2nd



        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return result;
    }

}
