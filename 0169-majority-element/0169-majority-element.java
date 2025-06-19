class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maxCount =0;
        int count =0;
        int maxElement=0;

        if(nums.length==1) {
            return nums[0];
        }

        for(int i=0; i<n; i++) {
            count=0;
            for(int j=i+1;j<n;j++) {
                if (nums[i]==nums[j]) {
                count++;
                }
                if(count > maxCount) {
                maxCount = count;
                maxElement = nums[i];
                }
            }
        }
        return maxElement;
    }
}