// problem link
// https://leetcode.com/problems/positions-of-large-groups/

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        if(S == null || S.length() == 0) return res;
        S = S + "$";
        int i = 0, j = 0;
        while(j < S.length()){
            if(S.charAt(j) == S.charAt(i)){
                j++;
                continue;
            }else{
                int len = j - i;
                if(len >= 3){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j-1);
                    res.add(temp);
                }
                i = j;
            }
        }
        return res;
    }
}