class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int [nums.length];
        int start = 0;
        int end = nums.length - 1;
        int j = end;
        while(start<=end){
            if(Math.abs(nums[start])>= Math.abs(nums[end])){
                res[j] = nums[start]*nums[start];
                start++;
            }else{
                res[j] = nums[end]*nums[end];
                end--;
            }
            j--;
        }
        return res;
    }
}