class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        for(int i = nums.length -1 ; i>=0; i--){
            min = Math.min(min,nums[i]);
            if (nums[i]!=min){
                left = i;
            }
        }
        for(int i = 0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
            if (nums[i]!=max){
                right = i;
            }
        }
        if (left == 0 && right == 0){
            return 0;
        }
        return right-left+1;
    }
}