class Solution {
    public boolean validPalindrome(String s) {
        int j = s.length()-1 ;
        int i = 0;
        boolean flag = false;
        boolean ans1 = true;
        boolean ans2 = true;
        while( i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else if (s.charAt(i+1) == s.charAt(j)&& !flag){
                flag = true;
                i++;
            } else{
                ans1 = false;
                j--;
            }
        }
        
        i=0;
        j = s.length()-1;
        flag = false;
        while( i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else if (s.charAt(i) == s.charAt(j-1) && !flag){
                flag = true;
                j--;
            }
            else{
                i++;
                ans2 = false;
            }
        }
        // System.out.println(ans1 + " " + ans2);
        return (ans1 || ans2);
    }
}