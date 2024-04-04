package first_ideaprogram.src.Leetcode_questions;

import java.util.Arrays;

public class HowManyNUmberSmallestThanCurrentNumber {
    public static void main(String[] args) {
        int [] nums ={8,5,2,4,1};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
        static int[] smallerNumbersThanCurrent(int[] nums) {
            int max = -1;
            for(int num : nums){
                max = Math.max(max, num);
            }

            int[] count = new int[max + 1];
            for(int num : nums){
                count[num]++;
            }

            int[] prefix = new int[count.length + 1];
            for(int i = 1 ; i < prefix.length; i++){
                prefix[i] = prefix[i - 1] + count[i - 1];
            }

            int[] res = new int[nums.length];
            for(int i = 0 ; i < nums.length; i++){
                res[i] = prefix[nums[i]];
            }
            return res;
        }
    }

