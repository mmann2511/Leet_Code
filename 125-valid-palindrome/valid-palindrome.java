class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        char[] chars = sb.toString().toCharArray();

        

        int i = 0;
        int j = chars.length - 1;

        while (i <= j) {
            if (chars[i] != (chars[j])){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}