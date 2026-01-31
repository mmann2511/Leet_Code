class Solution {
    public int[] plusOne(int[] digits) {
        // walk backwards, if not 9 increment then return 
        for (int index = digits.length -1; index >= 0; index--) {
            if (digits[index] != 9) {
                digits[index] += 1;
                return digits;
            }
            // if 9, make 0, then increment next
            digits[index] = 0;   
        }

        // if all nines, no matter how many
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
      
        return newArray;

    }
}