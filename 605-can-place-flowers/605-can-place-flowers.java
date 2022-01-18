class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length == 1){
          if (flowerbed[0] == 0){
                flowerbed[0]=1;
            count++; 
            }  
        }else{
     for (int i = 0; i< flowerbed.length; i++){
         if (i==0){
            if (flowerbed[i] == 0 && flowerbed[i+1] == 0 ){
                flowerbed[i]=1;
            count++; 
            }   
         }else if (i==flowerbed.length-1){
            if (flowerbed[i] == 0 && flowerbed[i-1] == 0){
                flowerbed[i]=1;
            count++; 
            }
         }else{
            if (flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                flowerbed[i]=1;
            count++; 
            }
         }
     }}
        return count>=n;
    }
}