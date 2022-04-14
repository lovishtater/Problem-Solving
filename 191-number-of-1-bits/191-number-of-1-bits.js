/**
 * @param {number} n - a positive integer
 * @return {number}
 */
var hammingWeight = function(n) {
return (n >>> 0).toString(2).split(1).length - 1
};