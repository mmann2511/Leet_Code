class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        # .strip removes leading/trailing spaces
        # .split divides string into a list of words
        words = s.strip().split()

        # return len of last word
        return len(words[-1])