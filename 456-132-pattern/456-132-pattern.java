class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        
        int thirdElement = Integer.MIN_VALUE;
        
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < thirdElement) return true;
            while(!st.isEmpty() && st.peek() < nums[i]) thirdElement = st.pop();
            st.push(nums[i]);
        }
        return false;
    }
}