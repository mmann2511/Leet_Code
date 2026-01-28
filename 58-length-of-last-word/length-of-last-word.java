class Solution {
    public int lengthOfLastWord(String s) {
        // returns the length of the last word in the string, so return an int
        // i guess i could start at end of string and linear scan backwards
        int length = 0;

        for (int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                return length;
            }
            
        }
        return length;
    }
}