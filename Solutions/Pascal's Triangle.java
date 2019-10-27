// problem link
// https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        List<Integer> t = new ArrayList<>();
        t.add(1);
        res.add(t);
        if(numRows == 1) return res;
        List<Integer> pre = t;
        
        for(int i = 2; i <= numRows; i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            int j = 1;
            while(j < i-1){
                cur.add(pre.get(j-1) + pre.get(j));
                j++;
            }
            cur.add(1);
            pre = cur;
            res.add(cur);
        }
        return res;
    }
}