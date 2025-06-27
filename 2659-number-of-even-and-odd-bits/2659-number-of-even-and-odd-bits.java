class Solution {
    public int[] evenOddBit(int n) {
        int[] answer = new int[2];
        while(n!=0) {
            if ((n&1) == 1) answer[0]++;
            n = n>>1;
            if ((n&1) == 1) answer[1]++;
            n = n>>1;
        }
        return answer;
    }
}