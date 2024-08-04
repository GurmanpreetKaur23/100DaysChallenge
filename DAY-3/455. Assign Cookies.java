// https://leetcode.com/problems/assign-cookies/description/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g) ;
        Arrays.sort(s) ;

        int child =  0 ;
        int cookies = 0 ;

        while(child<g.length && cookies<s.length) {
            // if satisfies , then move to next child 
             if (s[cookies] >= g[child]) {
                child++;  
            }
            cookies++ ;
        }
        return child;
    }

}
