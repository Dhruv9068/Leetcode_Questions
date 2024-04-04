package Leetcode_questions;

public class RoatedBinarySearch {
    public static void main(String[] args) {
int []arr ={4,5,6,7,0,1,2};
int target = 0;

System.out.println(search(arr, target));
    }


    static int search(int[] nums, int target) {
int pivot= findPivot(nums);
 if (pivot == -1){
     //just do normal binary search
     return BinarySearch(nums , target , 0,nums.length-1);

 }
 // if pivot is found , you have found 2 asc sorted arrays
        if(nums[pivot]== target){
            return pivot;
        }

        if(target >= nums[0]){
          return  BinarySearch(nums , target , 0,pivot -1);

        }

          return  BinarySearch(nums , target , pivot+1,nums.length-1);




    }

    static int BinarySearch(int[] bs,int target,int start , int end) {


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == bs[mid]) {
                return mid;
            } else if (target > bs[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }


        return -1;
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


