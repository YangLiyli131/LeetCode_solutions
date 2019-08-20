// problem link
// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/

class Solution {
    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(3);
        hs.add(5);
        hs.add(7);
        hs.add(11);
        hs.add(13);
        hs.add(17);
        hs.add(19);
        for(int ii = L; ii <= R; ii++){
            int n = 0;
            int i = ii;
            while(i != 0){
                int t = i % 2;
                if(t == 1) n++;
                i /= 2 ;
            }
            if(hs.contains(n)) res++;
        }
        return res;
    }
}