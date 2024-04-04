package first_ideaprogram.src.Leetcode_questions;

public class SubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if (k == 0 || k == 1) {
            return 0;
        }
        int i = 0, j = 0;
        int product = 1;
        int count = 0;
        while (j < n) {
            product *= nums[j];
            while (i < n && product >= k) {
                product /= nums[i];
                i++;
            }
            count += j - i + 1;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int result = numSubarrayProductLessThanK(nums, k);
        System.out.println("Number of subarrays with product less than " + k + ": " + result);
    }
}
