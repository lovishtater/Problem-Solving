class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
       for (int i = 0; i< nums.length; i++){
           sum += nums[i];
       }
        int currSum = 0;
       for (int i = 0; i< nums.length; i++){
           // System.out.println(sum - nums[i] +" "+ 2*currSum);
            if(sum - nums[i] == 2*currSum)
                return i;
            currSum += nums[i];
       }
        return -1;
    }
}