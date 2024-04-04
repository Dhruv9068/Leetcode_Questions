package first_ideaprogram.src.Leetcode_questions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] bs = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(BinarySearch(bs, target,0));
    }

    public static int BinarySearch(int[] bs,int target,int start){

        int end = bs.length -1;


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
}

