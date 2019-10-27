// problem link
// https://leetcode.com/problems/pascals-triangle-ii/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        if(rowIndex == 0) return res;
        long cur = 1;
        int t = rowIndex;
        for(int i = 1; i < rowIndex; i++){
            cur = cur * t;
            cur = cur / i;
            res.add((int)cur);
            t--;
        }
        
        res.add(1);
        return res;
    }
}