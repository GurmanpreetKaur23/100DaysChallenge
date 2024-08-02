// https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length ;
        int m = matrix[0].length ;

        int start = 0 ;
        int end = m-1 ;

        while(start<n && end>=0 ) {
            if(matrix[start][end]==target) return true ;
            else if(matrix[start][end]>target) end-- ;
            else start++ ;
        }
        return false ;
    }
}
