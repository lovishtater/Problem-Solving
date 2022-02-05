/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let i = 0, j = 0;
    while ( j < nums.length){
        if (nums[i] === nums[j]) {
            j++;
        }else{
            nums[i+1] = nums[j]
            i++;
            j++;
        }
    
    }
    return i+1
};