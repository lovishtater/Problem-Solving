class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int right = n-1;
        int left = 0;
        int count = 1;
      while( right>=left ){
            for (int j = left; j<=right; j++){
               // System.out.println("right m " + i +","+ j);
                arr[top][j] = count++;
            }
            top++;
            for (int i = top; i<=bottom; i++){
                arr[i][right] = count++;
            }
            right--;            
            for (int j = right; j>=left; j--){
                arr[bottom][j] = count++;
                
            }
            bottom--;
            for (int i = bottom; i>=top; i--){
               // System.out.println("left m " + i +","+ j);
                arr[i][left] = count++;
                
            }
            left++;
        }
        return arr;
    }
}