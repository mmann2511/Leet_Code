class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        # Start from the last digit and move backwards
        for i in range(len(digits) -1, -1, -1):
            # If digit is less than 9, just add 1 and return
            if digits[i] < 9:
                digits[i] += 1
                return digits

            # if digit is 9, it becomes 0 and carry the 1 to the next left digit
            digits[i] = 0

        # if all digits were 9, we need a leading 1
        return [1] + digits        