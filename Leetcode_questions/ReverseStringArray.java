package Leetcode_questions;

import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        char []s ={'o','v', 'c','d','a'};
        ReverseString(s);
        System.out.println(Arrays.toString(s));


    }
    static void ReverseString(char[] s){
        int left =0;
        int right = s.length -1;
        while(left<=right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            // move the pointers left and right left increase right decrease

            left++;
            right--;

        }
    }
}
