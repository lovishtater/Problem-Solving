class Solution {
        
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length, len = 0;
        
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        
        int dp[] = new int[n];
        for(int[] envelope : envelopes){
            int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
            if(index < 0)
                index = -(index + 1);
            dp[index] = envelope[1];
            if(index == len)
                len++;
        }
		
        return len;
    }   
}