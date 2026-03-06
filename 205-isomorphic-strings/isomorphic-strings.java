class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!mapS.containsKey(s.charAt(i))) {
                if (!mapT.containsKey(t.charAt(i))) {
                    mapS.put(s.charAt(i), t.charAt(i));
                    mapT.put(t.charAt(i), s.charAt(i));
                }
                else {
                    return false;
                }  
            }
            else if (mapS.get(s.charAt(i)).equals(t.charAt(i))) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;

    }
}