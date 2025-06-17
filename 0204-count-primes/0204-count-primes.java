class Solution {
    public int countPrimes(int n) {
        int count = 0;
        if ( n < 2) {
            return 0;
        }
        boolean[] notPrime = new boolean[n];
        Arrays.fill(notPrime,false);

        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
            for (long j = (long) i*i; j < n; j+=i) {
                notPrime[(int)j] = true;
            }
            }
        }
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
            }
        }
        return count;
    }
}