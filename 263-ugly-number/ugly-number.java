class Solution {
    public boolean isUgly(int n) {
        // positive integer which does NOT have a prime factor
        // other than 2, 3, 5
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        

        return n == 1;
    }
}