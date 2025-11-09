class Solution:
    def addBinary(self, a: str, b: str) -> str:
        i = len(a) - 1
        j = len(b) - 1
        carry = 0
        result = []

        while i >= 0 or j >= 0 or carry:
            total = carry
            if i >= 0:
                total += int(a[i])
                i -= 1
            if j >= 0:
                total += int(b[j])
                j -= 1   

            # Append the binary digit
            result.append(str(total % 2))

            # Update Carry
            carry = total // 2
             
        # Reverse because we built it backwards
        return "".join(reversed(result))         