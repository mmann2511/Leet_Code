class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
      
      // Build through iteration
      for (int i = 0; i < numRows; i++) {
         List<Integer> row = new ArrayList<>();
         
         // first edge
         row.add(1);
         
         // now interior
         for (int j = 1; j < i; j++) {
            List<Integer> prevRow = triangle.get(i - 1);
            int value = prevRow.get(j - 1) + prevRow.get(j);
            row.add(value);
         }
         
         // last edge only if more than one element
         if (i > 0) {
            row.add(1);
         }
         triangle.add(row);
      }
      return triangle;  
    }
}