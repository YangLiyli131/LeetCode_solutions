// problem link
// https://leetcode.com/problems/self-dividing-numbers/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(self_divide(i)) res.add(i);
        }
        return res;
    }
    public boolean self_divide(int x){
        String s = Integer.toString(x);
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(c == '0' || x % Character.getNumericValue(c) != 0) return false;
        }
        return true;
    }
}
