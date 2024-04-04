package Leetcode_questions;

public class FindMinimumInRotationsortedarray {

    public static void main(String[] args) {
        int []arr ={4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(findMin(arr));
    }
        static int findMin(int[] nums) {
            int pivot = findPivot(nums);
            if (pivot == -1) {
                // No rotation, the first element is the minimum
                return nums[0];
            }
            // Minimum element is at pivot + 1 index
            return nums[pivot + 1];
        }
       static int findPivot(int [] arr){
            int start =0;
            int end = arr.length-1;
            while(start<=end){
                int mid =start +(end-start)/2;
                //// 4 cases are here

                if (mid<end && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if (mid>start && arr[mid]<arr[mid-1]){
                    return mid-1;
                }
                if(arr[start] >=arr[mid]){
                    end =mid-1;
                }
                else{
                    start = mid+1;
                }

            }

            return -1; }

}
