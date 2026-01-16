class Solution {
    public int removeDuplicates(int[] nums) {
        // need to slide indexes
        int indexSlider = 1;

        // starting at index 1, scan each value
        for (int i = 1; i < nums.length; i++) {
            // if nums[i] != nums[i-1], that means its unique, do the loop
            if (nums[i] != nums[i - 1]) {
                // slide unique variable over
                nums[indexSlider] = nums[i];
                indexSlider++;
            }
            // else it equals, its a duplicate, do nothing but go to next i
        }
        return indexSlider;
    }
}