class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> prev = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> current = new ArrayList<>();

            // always starts with a 1
            current.add(1);

            // not inners
            for (int j = 1; j < i; j++) {
                int value = prev.get(j - 1) + prev.get(j);
                current.add(value);
            }

            // end
            if (i > 0) {
                current.add(1);
            }

            prev = current;
        }
        return prev;
    }
}