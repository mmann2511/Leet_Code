class Solution {
    public void moveZeroes(int[] nums) {
        
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;

            }
            else {
                nums[insertPos++] = nums[i];
            }
        }

        for (int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}