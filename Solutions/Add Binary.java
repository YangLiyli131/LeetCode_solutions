// problem link
// https://leetcode.com/problems/add-binary/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int la = a.length();
        int lb = b.length();
        int len = la >= lb? la : lb;
        int c = 0;
        int s;
        for(int i = la-1, j = lb-1; len >= 0; i--, j--, len--){
            int x = i < 0? 0 : (a.charAt(i) - '0');
            int y = j < 0? 0 : (b.charAt(j) - '0');
            s = (x+y+c) % 2;
            if(len != 0 || (len == 0 && s != 0)) sb.append(s);
            c = (x+y+c) / 2;
        }
        return sb.reverse().toString();
    }
}