class Solution {
    public boolean search(int[] nums, int target) {
        // lets find the pivot point!
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return true;
            }
        }
        return false;
        // int lp = bp;
        // int rp = bp+1;

        // while (lp<rp) {
        //     if (nums[lp] == target || nums[rp] == target) {
        //         return true;
        //     }
        //     else if (nums[lp]<target) {
        //         lp++;
        //     }
        // }

    }
}