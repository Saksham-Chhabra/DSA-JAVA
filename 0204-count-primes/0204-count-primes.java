class Solution {
    public int countPrimes(int n) {
        int count = 0;
        if ( n < 2) {
            return 0;
        }
        boolean[] notPrime = new boolean[n];
        Arrays.fill(notPrime,false);

        for (int i = 2; i*i < n; i++) {
            if (notPrime[i] == false) {
            for (int j = i*i; j < n; j+=i) {
                notPrime[j] = true;
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