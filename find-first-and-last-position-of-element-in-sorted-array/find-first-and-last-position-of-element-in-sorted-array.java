class Solution {
    public int firstOccurance(int[] nums, int target) {
      int left = 0; 
      int right = nums.length-1;
        int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
                if (target<nums[mid]){
                    right = mid-1;
                }else if (target>nums[mid]){
                    left = mid + 1;
                }else{
                    ans = mid;
                    right = mid-1;
                }
        }
        return ans;
    }
        public int lastOccurance(int[] nums, int target) {
      int left = 0; 
      int right = nums.length-1;
        int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
                if (target<nums[mid]){
                    right = mid-1;
                }else if (target>nums[mid]){
                    left = mid + 1;
                }else{
                    ans = mid;
                    left=mid+1;
                }
        }
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        Arrays.fill(arr,-1);
        arr[0] = firstOccurance(nums,target);
        arr[1] = lastOccurance(nums,target);
        return arr;
    }
}