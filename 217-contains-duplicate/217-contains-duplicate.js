/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
   let map = new Map();
    for (let i = 0; i< nums.length; i++){
        if (map.has(nums[i])){
            return true
        }
        map.set(nums[i], 0)  
    }
    
    return false
};