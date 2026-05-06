func lengthOfLongestSubstring(s string) int {
    m := make(map[rune]int)

    longest := 0
    left := 0
    
    for right, ch := range s {
        lastSeen, ok := m[ch]
        if ok && lastSeen + 1 > left{
            left = lastSeen + 1
        }
        m[ch] = right
        window := right - left + 1
        if window > longest {
            longest = window
        }
    }



    return longest

}