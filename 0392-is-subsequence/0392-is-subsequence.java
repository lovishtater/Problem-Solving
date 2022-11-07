class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int p = 0;
        for (int i = 0; i< t.length() && p < s.length(); i++){
            if(t.charAt(i) == s.charAt(p)){
                p++;
            }
        }
        System.out.println(p);
        return p == s.length();
    }
}