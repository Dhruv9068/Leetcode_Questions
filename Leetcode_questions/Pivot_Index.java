package Leetcode_questions;

public class Pivot_Index {
    public static void main(String[] args) {
        int [] nums ={2,2,5,1,3};
        System.out.println(pivotIndex(nums));
    }
    static int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int current_sum = 0;

        // Calculate the total sum of the array.
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        // Iterate through the array and find the pivot index.
        for (int i = 0; i < n; i++) {
            if (sum - nums[i] ==  current_sum) {
                return i;
            }
            current_sum += nums[i];
            sum=sum - nums[i];
        }

        // If no pivot index is found, return -1.
        return -1;
    }
}

