class Solution {
    public int matrixSum(int[][] nums) {
        for(int [] row:nums){
            Arrays.sort(row);   // study this later how!?
        }
        int score = 0;

        for (int col = 0; col < nums[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < nums.length; row ++) {
                max = Math.max(nums[row][col],max);
            }
            score+= max;
        }
return score;
    }
}