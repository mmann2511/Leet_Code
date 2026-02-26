class Solution {
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();

        int result = 0;

        for (char letter : chars) {
            int current = letter - 'A' + 1;
            result = result * 26 + current;
        }

        return result;
    }
}