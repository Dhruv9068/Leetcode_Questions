package first_ideaprogram.src.Leetcode_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import first_ideaprogram.src.Leetcode_questions.BinarySearch;

public class TwoSum {
    public static void main(String[] args) {
int[] nums = {2,7,4,11};
int target =9;
System.out.println(Arrays.toString(twoSumBrute(nums, target)));
System.out.println(Arrays.toString(twoSum(nums, target)));
System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSumBrute(int[] nums,int taregt){
        for(int i =0; i< nums.length-1;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==taregt){
                    return new int[]{i,j};
                }
            }
        }

    return new int[]{};
    }
    static int[] twoSum(int [] nums , int target){
        Map<Integer, Integer> m = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int comp= target- nums[i];
            if(m.containsKey(comp)){
                return new int[] {m.get(comp),i};
            }
            m.put(nums[i],i);
        }


        return new int[] {};
    }
    static int[] twoSumBS(int [] nums , int target){

        for (int i=0;i<nums.length;i++){
            int comp= target- nums[i];
            int index = BinarySearch.BinarySearch(nums, comp, i+1);
            if(index!=-1){
                return new int[] {comp,index};
            }
        }


        return new int[] {};
    }

}



