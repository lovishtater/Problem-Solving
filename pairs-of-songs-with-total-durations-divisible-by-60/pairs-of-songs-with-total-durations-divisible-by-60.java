class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int arr[]  = new int[60], ans = 0;
        for (int t : time) {
            ans += arr[(600 - t) % 60];
            // System.out.println(ans+" "+ t);
            arr[t % 60] += 1;
        }
        return ans; 
    }
}