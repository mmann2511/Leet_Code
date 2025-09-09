class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {')': '(', '}': '{', ']': '['} # close open pairs

        for char in s:
            if char in mapping: # it's closing bracket
                top = stack.pop() if stack else '#'
                if mapping[char] != top:
                    return False
            else:
                stack.append(char) # opening bracket

        return not stack # True if empty (all matched)                


        