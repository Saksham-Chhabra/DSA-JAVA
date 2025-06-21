class Solution {
    public int hammingWeight(int n) {
        int remainder = 0;
        int binary = 0;
        int power = 0;
        int count = 0;

        while (n>0) {
            remainder = n % 2;
            if (remainder == 1) count++;
            binary += remainder*(Math.pow(10,power));
            power++;
            n = n/2;
        }
        return count;
    }
}