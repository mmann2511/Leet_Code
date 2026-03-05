class Solution {
    public boolean isHappy(int n) {
        // determines if a number is happy
        // return true if happy, false if not

        // starting with any positive number
        // replace the sum the number by the squares of its digits
        // example 19 = 1 & 9 = 1^2 + 9^2 = 82
        // 8^2 + 2^2 = 68 -> 6^2 + 8^2 = 100 -> 1^2 + 0 + 0 = 1 return true
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        return true;
    }
}