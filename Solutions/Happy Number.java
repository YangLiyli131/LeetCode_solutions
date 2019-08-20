// problem link
// https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n != 1){
            int s = 0;
            while(n != 0){
                s += (n%10) * (n%10);
                n /= 10;
            }
            n = s;
            if(hs.contains(n)) return false;
            else hs.add(n);
        }
        return n == 1;
    }
}