class Solution {
public int countSubstrings(String str) {
        char[] s = str.toCharArray();
        int n = s.length;
        int count = 0;
        for(int i = 0; i < n; i++){
        // j - start 
        // k - end
            int j = i, k = i;
            while( j >= 0 && k < n && s[j] == s[k])   {
                count++;
                j--;
                k++;
            }
            
            j = i; 
            k = i+1;
            while( j >= 0 && k < n && s[j] == s[k])  {
                count++;
                j--;
                k++;
            }
        
        }
        
        return count;
    }
}