class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        opening = {'(', '{', '['}
        mapping = {')': '(', '}': '{', ']': '['}
    
        for char in s:
            if char in opening:
                stack.append(char)
            else:  # closing bracket
                if not stack or stack.pop() != mapping[char]:
                    return False
    
        return not stack               


        