package Leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_Or_3sum {
    public static void main(String[] args) {
        // Main method where the code logic can be executed (currently empty)
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.deepToString(threeSum(nums).toArray()));
    }

        static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<>(); // Initialize a List to store the triplets
        Arrays.sort(nums); // Sort the input array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for the first element
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    returnList.add(Arrays.asList(nums[i], nums[left], nums[right])); // Add valid triplet to the list
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++; // Skip duplicates for the second element
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--; // Skip duplicates for the third element
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return returnList; // Return the list of unique triplets
    }
}
