package Leetcode_questions;
import java.util.ArrayList;
import java.util.Arrays;


public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int [] nums1 ={ 1,1,2,3,4,5};
        int [] nums2 ={ 1,1,8,6,4,3,9};
        System.out.println(Arrays.toString(intersection( nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        ArrayList<Integer> L = new ArrayList<>();
        Integer prev = null; // To track the previous element.

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (prev == null || prev != nums1[i]) {
                    L.add(nums1[i]);
                    prev = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] intersection = new int[L.size()];
        for (int k = 0; k < L.size(); k++) {
            intersection[k] = L.get(k);
        }

        return intersection;
    }
}



