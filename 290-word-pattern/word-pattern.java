class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word_list = s.split(" ");

        if (word_list.length != pattern.length()) {
            return false;
        }

        // pattern -> string
        HashMap<Character, String> map = new HashMap<>();

        HashMap<String, Character> map2 = new HashMap<>();
        

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(word_list[i])) {
                    return false;
                }
                // char -> str
                map.put(pattern.charAt(i), word_list[i]);

                map2.put(word_list[i], pattern.charAt(i));

            }
            else if (!map.get(pattern.charAt(i)).equals(word_list[i]) ||
                    !map2.get(word_list[i]).equals(pattern.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}