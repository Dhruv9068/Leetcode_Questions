package Leetcode_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_element_fromArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        int valToRemove = 3;
        int newLength = removeElement(arr, valToRemove);

        System.out.println("Array after removing " + valToRemove + ":");
        System.out.println(Arrays.toString(arr));
    }

    public static int removeElement(int[] nums, int val) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
}
