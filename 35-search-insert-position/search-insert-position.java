class Solution {
    public int searchInsert(int[] nums, int target) {
        // O(log n) means binary
        //lets just do a binary search to find the actual target first, assuming its there

        // return index, not actual value
        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int currentItem = nums[mid];

            if (currentItem == target) {
                return mid;
            }
            if (target < currentItem) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }

        }
        return left;
    }
}