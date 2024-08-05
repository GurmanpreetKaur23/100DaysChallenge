// https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1

class Solution {
    public static int rev(int num) {
        int og = num ;
        int reverse = 0;
        while(num>0) {
            int digit = num%10 ;
            reverse = reverse*10 + digit ;
            num /=10 ;
        }
        if(og == reverse) return 1 ;
        else return 0 ;
    }
    public static boolean palinArray(int[] arr) {
        // add code here.
        
        // iterate through the array
        for(int i=0 ; i<arr.length ; i++) {
            if(rev(arr[i])==0) {return false ;}
            
        }
        return true ;
    }
}
