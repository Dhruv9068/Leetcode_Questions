package Leetcode_questions;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] C = {'x', 'x', 'y', 'y'};
        char target = 'z';
        System.out.println(nextGreatestLetter(C,target));

    }
    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target < letters[mid]) {
                end = mid-1;

            } else {
                start = mid + 1;
            }
            // we remove  line of return mid because it not required element equal to target

        }
        //the only change in this if we dont find the number we return letter at [start % length of array] not -1
        return letters[start % letters.length];
        // [start % length of array] we are using this because we want if the thier is not letter greater than target then we have to return first one so we use modulus
    }

}
