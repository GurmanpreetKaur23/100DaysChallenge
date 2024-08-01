// https://leetcode.com/problems/spiral-matrix/description/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> mat = new ArrayList<>();
        int m = matrix.length; // rows 
        int n = matrix[0].length; // columns
        int top = 0 ;
        int bottom = m-1;
        int left = 0 ;
        int right = n-1 ;

        int curr = 0 ;
        int total = n*m ; // taaki out of bound na jaaye 

        while(curr<total) {
            // left->right
            for(int i=left ; i<=right && curr<total ; i++) {
                mat.add(matrix[top][i]) ;
                curr++ ;
            }
            top++ ; // kyuki top ik thalle aayega

            // top->bottom
            
            if(top<=bottom){ // je valid cell hai ta
                for(int i=top ; i<=bottom && curr<total ; i++) {
                mat.add(matrix[i][right]) ;
                curr++ ;
            }
            right-- ;
            }

            // right->left 
           if(left<=right) {
             for(int i=right ; i>=left && curr<total ; i--) {
                mat.add(matrix[bottom][i]) ;
                curr++ ;
            }
            bottom-- ;
           }

            //bottom->top
            
            if(top<=bottom) { // if cell is valid
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
