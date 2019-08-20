// problem link
// https://leetcode.com/problems/reverse-string-ii/

class Solution {
    public String reverseStr(String s, int k) {
        if(s.length() <= k) return rev(s);
        if(s.length() <= 2*k){
            StringBuilder sg = new StringBuilder();
            return sg.append(s.substring(0,k)).reverse().toString() + s.substring(k,s.length());
        }
        Queue<String> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i += k){
            if(i+k <= s.length()){
                q.add(s.substring(i,i+k));
            }else{
                q.add(s.substring(i,s.length()));
            }
        }
        int idx = 1;
        String res = "";
        while(q.size() != 0){
            String t = q.poll();
            if(idx % 2 == 1){
                res += rev(t);
            }else{
                res += t;
            }
            idx++;
        }
        return res;
    }
    private String rev(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return sb.reverse().toString();
    }
}