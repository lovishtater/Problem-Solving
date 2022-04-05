class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left<right){
            int width = right-left;
            int minHeight = Math.min(height[right],height[left]);
            int area = minHeight * width;
            if (max < area){
                max = area;
            }
            if(height[right] >height[left]) left++;
            else if (height[right] <height[left]) right--;
            else{
                right--;
                left++;
            }
        }
        return max;
    }
}