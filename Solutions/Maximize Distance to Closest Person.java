// problem link
// https://leetcode.com/problems/maximize-distance-to-closest-person/

class Solution {
    public int maxDistToClosest(int[] seats) {
        int res = 0;
        int pre = 0, cur = 0, d, f = 1;
        int first_one = -1;
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 1){
                if(f == 1){
                    pre = i;
                    first_one = i;
                    f = 0;
                }else{
                    cur = i;
                    d = (cur - pre)/2;
                    res = Math.max(d,res);
                    pre = cur;
                }
            }
        }
        int last_one = cur;
        int a = Math.max(seats.length-1-pre,pre);
        int b = Math.max(Math.max(res, first_one), seats.length - last_one-1);
        return cur == 0? a : b;
    }
}