// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        int min = Integer.MAX_VALUE ;
        Collections.sort(a) ;
        
        for(int i=0 ; i<=n-m ; i++) { // n-m taki out of bound na jaaye
           int diff = a.get(i + m - 1) - a.get(i); // i+m-1 -> ethe tk jaana
            min = Math.min(min, diff);
        }
        
        return min ;
    }
}
