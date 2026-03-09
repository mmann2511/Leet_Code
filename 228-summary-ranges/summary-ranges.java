class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();

        
        int start = 0;

        for (int i = 1; i <= nums.length; i++) {
            int rear = i - 1;

            if (i == nums.length || nums[i] != nums[rear] + 1) {
                if (nums[start] == nums[rear]) {
                    result.add("" + nums[start]);
                    start = i;
                }

                else if (nums[start] != nums[rear]) {
                    result.add(nums[start] + "->" + nums[rear]);
                    start = i;
                }
            } 
        }      
        return result;
    }
}