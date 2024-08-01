// https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&sortBy=submissions

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer , Integer> freq = new HashMap<>() ;
        
        for(int i=0 ; i<size ; i++) {
            if(freq.containsKey(a[i])) {
                freq.put(a[i], freq.get(a[i])+1);
            }
            else {
                freq.put(a[i] , 1) ;
            }
            
             if(freq.get(a[i])> size/2) return a[i] ;
        }
        
       
       return -1 ;
    }
}
