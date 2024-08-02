// https://www.geeksforgeeks.org/problems/kth-element-in-matrix/1

class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        ArrayList<Integer> Matrix = new ArrayList<>() ;
        
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                Matrix.add(mat[i][j]) ;
            }
        }
        
        Collections.sort(Matrix) ;
        
        return Matrix.get(k-1) ;
    }
}
