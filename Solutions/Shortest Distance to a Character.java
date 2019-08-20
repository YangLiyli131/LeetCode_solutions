// problem link
// https://leetcode.com/problems/shortest-distance-to-a-character/

class Solution {
    public int[] shortestToChar(String S, char C) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < S.length(); i++){
            if(C == S.charAt(i)) li.add(i);
        }
        //or(int g : li) System.out.println(g);
        int[] res = new int[S.length()];
        for(int i = 0; i < S.length(); i++){
            int t = Integer.MAX_VALUE;
            for(int x : li){
                if(t > (Math.abs(x - i))) t = Math.abs(x-i);
            }
            res[i] = t;
        }
        return res;
    }
}