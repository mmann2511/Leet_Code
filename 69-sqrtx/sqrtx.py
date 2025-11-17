class Solution:
    def mySqrt(self, x: int) -> int:
        left_boundary = 0
        right_boundary = x

        while left_boundary <= right_boundary:
            mid_point = (left_boundary + right_boundary) // 2
            if mid_point * mid_point == x:
                return mid_point
            elif mid_point * mid_point < x:
                left_boundary = mid_point + 1
            elif mid_point * mid_point > x:
                right_boundary = mid_point - 1
        return right_boundary        
     
