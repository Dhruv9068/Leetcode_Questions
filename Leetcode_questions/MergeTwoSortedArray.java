package Leetcode_questions;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        System.arraycopy(nums3, 0, nums1, 0, m + n);



//         The code snippet System.arraycopy(nums3, 0, nums1, 0, m + n); is a Java statement that uses the System.arraycopy() method to copy elements from one array (nums3) to another array (nums1). Here's what each parameter signifies:

// nums3: Source array from which elements will be copied.
// 0: Starting index in the source array (nums3) from where the copy will begin.
// nums1: Destination array where elements will be copied.
// 0: Starting index in the destination array (nums1) where the copied elements will be placed.
// m + n: Number of elements to be copied.



        //     other way
        //for (int i = 0; i < m + n; i++) {
        // nums1[i] = nums3[i]; }
    }


}


