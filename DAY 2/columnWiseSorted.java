import java.util.* ;
public class Main
{
    public static int[][] columnWiseSorted(int mat[][], int n, int m) {
        for (int j = 0; j < m; j++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = mat[i][j];
            }
            Arrays.sort(column);

            for (int i = 0; i < n; i++) {
                mat[i][j] = column[i];
            }
        }

        return mat;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		int m = sc.nextInt() ;
		int mat[][] = new int[n][m] ; //n*m matrix
		
		for(int i=0 ; i<n ; i++){
		    for(int j=0 ; j<m ; j++) {
		        mat[i][j] = sc.nextInt() ;
		    }
		}
		System.out.println() ;
		columnWiseSorted(mat , n, m) ;
		for(int i=0 ; i<n ; i++){
		    for(int j=0 ; j<m ; j++) {
		       System.out.print(mat[i][j]+" ") ;
		    }
		    System.out.println() ;
		}
	}
}
