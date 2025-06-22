class Solution {
    public int[] numberOfPairs(int[] nums) {
        int toRemove = 0;
        int pairs = 0;

        Arrays.sort(nums);

        for (int i=0; i < nums.length-1; i++) {
            for (int j=i+1; j <nums.length; j++) {
                if (nums[i]==nums[j]) {
                    nums[i] = nums[j] = -1;
                    toRemove+=2;
                    pairs++;
                    break;         
                }
            }
        }

        int answer[] = new int[2];
        answer[0] = pairs;
        answer[1] = nums.length - toRemove;

        return answer;
    }
}