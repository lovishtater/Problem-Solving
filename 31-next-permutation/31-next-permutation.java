class Solution {
        private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
        private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int swap1 = 0;
      for (int i = nums.length - 1; i > 0 ; i--){
          if (nums[i]>nums[i-1]){
              swap1 = i-1;
              break;
          }else if (i==1){
            swap1 = -1;  
          }
      }
        if (swap1 >= 0){
      for (int i = nums.length - 1; i > swap1 ; i--){
          if (nums[swap1]<nums[i]){
              swap(nums, swap1, i);       
              break;
          }
      }
    }
        reverse(nums, swap1+1);
    }
}