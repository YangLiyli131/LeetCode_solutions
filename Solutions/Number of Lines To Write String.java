// problem link
// https://leetcode.com/problems/number-of-lines-to-write-string/

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        List<Integer> li = new ArrayList<>();
        char[] ch = S.toCharArray();
        int line = 1;
        int leng = 0;
        for(char c : ch){
            int id = c - 'a';
            int w = widths[id];
            if(leng + w <= 100) leng += w;
            else{
                line++;
                li.add(leng);
                leng = w;
            }
        }
        li.add(leng);
        int[] res = new int[2];
        res[0] = line;
        res[1] = li.get(li.size()-1);
        return res;
    }
}