// problem link
// https://leetcode.com/problems/rotated-digits/

class Solution {
    public int rotatedDigits(int N) {
        int res = 0;
        int count;
        for(int k = 0; k <= N; k++){
            int i = k;
            count = 0;
            while(i > 0){
                int d = i % 10;
                if(d == 3 || d == 4 || d == 7){
                    count = 0;
                    break;
                }
                if(d == 2 || d == 5 || d == 6 || d == 9){
                    count++;
                }
                i /= 10;
            }
            if(count > 0) res++;
        }
        return res;
    }
}