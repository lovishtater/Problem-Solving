class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1 ; 
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums [nums[fast]];
                // System.out.println(slow + " " + fast);
        }while(slow != fast);
            slow = 0;
        // System.out.println("break");
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
            // System.out.println(slow + " " + fast);
        }
        return slow;
    }
}