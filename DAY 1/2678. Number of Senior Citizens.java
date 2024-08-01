// https://leetcode.com/problems/number-of-senior-citizens/?envType=daily-question&envId=2024-08-01

class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String detail : details) {
            int age = Integer.parseInt(detail.substring(11,13)) ;  // 11th and 12th check hoga
            // convert to parseInt ke jehra string ch answer aaye it gets converted to int

            if(age>60) {
                count++ ;
            }
        }
        return count ;
    }
}
