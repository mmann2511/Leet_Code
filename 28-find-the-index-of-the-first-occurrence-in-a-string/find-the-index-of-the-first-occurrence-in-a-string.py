class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        hay_len = len(haystack)
        needle_len = len(needle)

        if needle_len > hay_len:
            return -1

        for index in range(hay_len - needle_len + 1):
            if haystack[index: index + needle_len] == needle:
                return index
        return -1            
