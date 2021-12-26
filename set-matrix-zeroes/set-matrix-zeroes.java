class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row = false, col = false;
        for (int i = 0; i< matrix[0].length; i++ ){
            if (matrix[0][i] ==0 ){
                row = true;
            }
        }
        
        for (int i = 0; i< matrix.length; i++ ){
            if (matrix[i][0] ==0 ){
                col = true;
            }
        }
        // System.out.print(row +" " +col);
        
        for (int i = 1; i<matrix.length;i++){
            for (int j = 1; j<matrix[0].length;j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        
        for (int i = 1; i<matrix.length;i++){
          for (int j = 1; j<matrix[0].length;j++){
                if (matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        
        if (row==true){
        for (int i = 0; i< matrix[0].length; i++ ){
               matrix[0][i] = 0; 
                
            }
        }
        
        if (col==true ){
        for (int i = 0; i< matrix.length; i++ ){
                 matrix[i][0] = 0; 
            }
        }
        
    }
}