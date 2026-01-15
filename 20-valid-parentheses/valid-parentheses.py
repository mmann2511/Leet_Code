class Solution:
    def isValid(self, s: str) -> bool:
        # Return true or false
        # Valid if open brackets must be closed by same type of brackets
        # Open brackets must be closed in the correct order
        # Every close bracket has a corresponding open brack of the same type
        # Dictionary and LIFO Stack
        pairs = {')': '(', '}': '{', ']': '['}
        stack = []

        for char in s:
            # if character is an opening value
            if char in pairs.values():
                stack.append(char)
            # if character is a closing value
            else:
                if not stack:
                    return False
                if stack[-1] != pairs[char]:
                    return False
                stack.pop()

        return len(stack) == 0                   

