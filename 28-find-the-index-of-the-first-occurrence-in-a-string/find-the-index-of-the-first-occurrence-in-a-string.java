class Solution {
    public int strStr(String haystack, String needle) {
        // if needle is empty
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        // if needle is longer than haystack
        if (needle.length() > haystack.length()) {
            return -1;
        }

        // bounds check. haystack can't be shorter than needle
        int bounds = haystack.length() - needle.length();
        
        for (int i = 0; i <= bounds; i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }    
            int j;
            for (j = 1; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            // if we matched the whole needle
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;

    }
}