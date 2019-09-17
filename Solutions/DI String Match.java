// problem link
// https://leetcode.com/problems/di-string-match/

// Think of available numbers to put as an array of [0, 1, 2, ..., len(S)]
// When you see "I", your safest option is to put lowest(leftmost) number for the next move, so it will always increase
// When you see "D", your safest option is to put highest(rightmost) number for the next move, so it will always decrease
// Don't forget to put latest number when l == r

class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int left = 0, right = n;
        int[] res = new int[n+1];
        for(int i = 0; i < n; i++){
            res[i] = S.charAt(i) == 'I'? left++ : right--;
        }
        res[n] = left;
        return res;
    }
}