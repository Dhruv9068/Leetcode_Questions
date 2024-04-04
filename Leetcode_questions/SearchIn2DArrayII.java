package Leetcode_questions;

public class SearchIn2DArrayII {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {1, 2, 3},
                {44, 5, 6}
        };
        int target = 3;
        System.out.println(Searchelement(arr , target));
    }

    static boolean Searchelement(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;


        while(r<matrix.length && c>= 0){
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target){
                c--;
            }
            else if(matrix[r][c] < target){
                r++;
            }
        }
        return false;
    }
}
