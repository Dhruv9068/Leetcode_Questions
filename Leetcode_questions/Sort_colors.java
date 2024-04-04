package Leetcode_questions;

import java.util.Arrays;

public class Sort_colors {
    public static void main(String[] args) {
        int [] nums ={1,5,0,0,8,9};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sortColors(int[] nums) {
        Arrays.sort(nums);

    }
}
