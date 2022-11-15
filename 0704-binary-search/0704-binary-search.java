class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0; 
        while (l<=r){
            int mid = (l+r)/2;
            if(target == nums[mid]) {
                return mid;
            }else if (target < nums[mid]) {
                r = mid - 1;
            }else if (target > nums[mid]){ 
                l = mid+1;
            }
        }
        return -1;
    }
}