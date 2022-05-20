/**
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
 var uniquePathsWithObstacles = function (obstacleGrid) {
  const M = obstacleGrid.length;
  const N = obstacleGrid[0].length;
  const memo = new Array(M).fill(0).map((v) => new Array(N).fill(0));

  const traverse = (x, y) => {
      
    if (obstacleGrid[x] === undefined || obstacleGrid[x][y] === undefined || obstacleGrid[x][y] === 1)          return 0; 

    if (x === M - 1 && y === N - 1) 
        return 1;

    if (memo[x][y] === 0) {
      memo[x][y] = traverse(x + 1, y) + traverse(x, y + 1);
    }
    return memo[x][y]; 
  };

  return traverse(0, 0);
};