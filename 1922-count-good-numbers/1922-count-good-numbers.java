class Solution {
    public int countGoodNumbers(long n) {
        long MOD = 1000000007;

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenWays = power(5, evenPositions, MOD);
        long oddWays = power(4, oddPositions, MOD);

        return (int)((evenWays * oddWays) % MOD);
    }

    public long power(long base, long exponent, long mod) {
        long result = 1;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }

            base = (base * base) % mod;
            exponent = exponent / 2;
        }

        return result;
    }
}