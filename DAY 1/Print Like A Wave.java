// https://www.naukri.com/code360/problems/print-like-a-wave_893268?leftPanelTabValue=PROBLEM

import java.util.* ;
import java.io.*; 

public class Solution {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) {
		// Write your code here.
		int[] result = new int[nRows * mCols] ;
		int index = 0 ;

		for(int col=0 ; col<mCols ; col++) {
			if(col%2==0) {
				for(int row = 0 ; row<nRows ; row++) {
					result[index++] = arr[row][col] ;
				}
			}

			else {
				for(int row=nRows-1 ; row>=0 ; row--) {
					result[index++] = arr[row][col] ;
				}
			}
		}
		return result ;
	}
}


