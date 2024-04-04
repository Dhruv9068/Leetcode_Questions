package Leetcode_questions;

public class SearchInMountain {
    public static void main(String[] args) {

        int[] bs ={1,2,3,4,5,3,1};
        int target =3;
        System.out.println(search(bs,target));

    }


    static int search(int[] bs , int target){
        int peak = peakIndexInMountainArray(bs);
        int firstTry = BinarySearch(bs , target , 0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return BinarySearch(bs, target, peak+1,bs.length-1);
    }
    static int BinarySearch(int[] bs,int target , int start , int end){
// this will for any type of array decending or accending sorted array


        if(bs[start]<bs[end]) {
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
        }

        else{
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == bs[mid]) {
                    return mid;
                } else if (target > bs[mid]) {
                    start = mid - 1;

                } else {
                    end = mid + 1;
                }
            }
        }

        return -1;
    }
    static int peakIndexInMountainArray(int[] arr){
        int start =0;
        int end =arr.length -1;
        while(start < end ){
            int mid = start+ (end-start) / 2;
            if(arr[mid] > arr[mid+1]){
                // you are in dex part of array
                //this may be the ans , but look at left
                // this is why end !=mid-1
                end = mid;
            }
            else{
                // you are in asc part of array
                start = mid+1; // because we know that mid+1 element > mid element

            }


        }
        // in the end , start ==end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence , when they are poiting to just one element , that is the max one because that is what the check say
        // more elaboration: at every point of time for start and end , they have the best possible answer till that time
        // and if  we are saying that only one item is remaining , hence cuz of above line that is the best possible answer

        return start;// or end both are equal
    }
}
