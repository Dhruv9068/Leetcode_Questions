package Leetcode_questions;

import java.util.Arrays;

public class FLippingAnImage {
    public static void main(String[] args) {
        int [][]image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    static int[][] flipAndInvertImage(int[][] image) {

        for( int i =0; i < image.length;i++){
            reverseRow(image[i]);
            for(int j =0; j< image[i].length ; j++){

                if(image[i][j]==1) image[i][j]=0;
                else  image[i][j]=1;

            }
        }
        return image;
    }

    static void reverseRow(int[] row) {
        int start = 0;
        int end = row.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;

            start++;
            end--;
        }
    }
}
