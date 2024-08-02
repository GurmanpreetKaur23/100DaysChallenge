// https://www.geeksforgeeks.org/problems/sorted-matrix2333/1

class Solution {
    int[][] sortedMatrix(int n, int Mat[][]) {
        // code here
        int k = 0 ; // sorted matrix de har element da index dssega
        ArrayList<Integer> matrix = new ArrayList<>() ;
        
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                matrix.add(Mat[i][j]) ; // har ik particularly row chuki jayegi 
            }
        }
        
        // then sort hojega
        Collections.sort(matrix);
        
        // fer elements place krne ne
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                Mat[i][j] = matrix.get(k++) ;
            }
        }
        return Mat ;
    }
};
