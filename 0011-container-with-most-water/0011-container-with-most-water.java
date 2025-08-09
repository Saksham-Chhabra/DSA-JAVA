class Solution {
    public int maxArea(int[] height) {
      // 2 pointer apporach : 
      int currentWater = 0;
      int maxWater = 0;
      int lp = 0;
      int rp = height.length-1;

      while (lp<rp) {
        currentWater = Math.min(height[lp],height[rp])*(rp-lp);
        maxWater = Math.max(currentWater,maxWater);
        if(height[lp]<height[rp]) lp++;
        else rp--;
      }
      return maxWater;
    }
}