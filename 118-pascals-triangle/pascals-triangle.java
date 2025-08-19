class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> vashu = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // first and last element are always 1
                } else {
                    int val = vashu.get(i - 1).get(j - 1) + vashu.get(i - 1).get(j);
                    row.add(val); // sum of two elements above
                }
            }
            
            vashu.add(row); // add row to triangle
        }

        return vashu;
    }
}
