package Leetcode_questions;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {1, 2, 3},
                {44, 5, 6}
        };
        int target =4;
        System.out.println(searchMatrix(arr,target));

    }
    static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows ; i++){

            for(int j=0; j<cols;j++){
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
