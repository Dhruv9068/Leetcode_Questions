package Leetcode_questions;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        int nums[] ={1,1,1,2,2,3};
        System.out.println("After removal of more than two duplicate elements: " + Arrays.toString(nums));
        System.out.println("Length of array after removing more than two occurence element: " + removeDuplicates(nums ));

    }

     static int removeDuplicates(int[] nums) {
        int count = 0;  // count hum changed array ke index ke liye use krahe hai kis index pe element dalna duplicate hata ke
        for (int num : nums) {
            if (count < 2 || num > nums[count - 2]) {    // agr count <2 , mtlv abhi 2 he element visit huwe hai true and put them at first 2 index ||                                                              num > nums[count-2] ye jab true hoga jab current number pichle 2 wale index se bada ho kyu ki                                                         equal huwa too 3 duplicate hojyenge or chota huwa too array is no more sorted
                nums[count++] = num;
            }
        }
        return count;
    }
}