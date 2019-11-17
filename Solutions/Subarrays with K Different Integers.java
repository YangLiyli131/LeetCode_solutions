// problem link
// https://leetcode.com/problems/subarrays-with-k-different-integers/

class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
        return atMostK(A,K) - atMostK(A,K-1);
    }
    private int atMostK(int[] A, int k){
        int i = 0, res = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int j = 0; j < A.length; j++){
            if(hm.getOrDefault(A[j],0) == 0) k--;
            hm.put(A[j], hm.getOrDefault(A[j],0)+1);
            while(k < 0){
                hm.put(A[i], hm.get(A[i])-1);
                if(hm.get(A[i]) == 0) k++;
                i++;
            }
            res += j-i+1;
        }
        return res;
    }
}