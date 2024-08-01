// https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        ArrayList<Integer> mat = new ArrayList<>() ;
        int n = matrix.length ; // rows
        int m = matrix[0].length ; // columns
        int top = 0 ;
        int bottom = n-1 ;
        int right = m-1 ;
        int left = 0 ;
        
        int curr = 0;
        int total = n*m ; // out of bound na jaaye
        
        while(curr<total){
            // left ->right
            for(int i=left ; i<=right && curr<total; i++) {
                mat.add(matrix[top][i]) ;
                curr++ ;
            }
            top++ ;
            
            
            // top->bottom
            if(top<=bottom) { // if cell is valid
                for(int i=top ; i<=bottom && curr<total; i++) {
                    mat.add(matrix[i][right]) ;
                    curr++ ;
                }
                right-- ;
            }
            
            // right -> left 
            if(left<=right) {
                for(int i=right ; i>=left && curr<total; i--) {
                    mat.add(matrix[bottom][i]) ;
                    curr++ ;
                }
                bottom-- ;
            }
            
            // bottom -> top
            if(top<=bottom) {
                for(int i=bottom ; i>=top && curr<total ; i--) {
                    mat.add(matrix[i][left]) ;
                    curr++ ;
                }
                left++ ;
            }
        }
        return mat ;
    }
}
