package Leetcode_questions;

import java.util.Arrays;

public class Three_3Sum_closet {
    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};
        int target =1;
        System.out.println(threeSumClosest(nums,target));
    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff =Integer.MAX_VALUE;
        int ans=0;
        for (int i=0;i<nums.length;i++){
            int first= nums[i];

            int left =i+1;
            int right=nums.length-1;

            while( left <right)
            {
                if(first+ nums[left]

                        + nums[right] == target) return target;

                else if(Math.abs(first+ nums[left]+ nums[right] -target ) < diff){
                    diff= Math.
                            abs((first+ nums[left]+nums[right] )- target);
                    ans = first+ nums[left] +nums[right];









                }
                if(first+nums[left]+ nums[right]> target) right--;
                else left++;
            }
        }

        return ans;
    }
}
