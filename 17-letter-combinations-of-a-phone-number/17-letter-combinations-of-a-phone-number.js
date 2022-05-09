/**
 * @param {string} digits
 * @return {string[]}
 */

var letterCombinations = function(digits) {  
   let res = []
   combinations(digits, '', res = [])
   return res
}


function combinations(digits, char='', res) {
   if(digits.length === 0) return []
   let map = {
        2: "abc",
        3: "def",
        4: "ghi",
        5: "jkl",
        6: "mno",
        7: "pqrs",
        8: "tuv",
        9: "wxyz"  
    }
   let nums = digits.split("") 
   let str =  map[+nums[0]] 
   if(digits.length === 1) {
      res.push(...str.split("").map(n => char + n))
      return
   }   
   for(let i = 0; i < str.length; i++) {
         combinations(digits.substring(1), char + str[i], res)  
   }
}