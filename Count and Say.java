// problem link
// https://leetcode.com/problems/count-and-say/

class Solution {
    public String countAndSay(int n) {
        if(n <= 0) return null;
        String res = "1";
        int i = 1;
        while(i < n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j = 1; j < res.length(); j++){
                if(res.charAt(j) == res.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(res.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(res.charAt(res.length()-1));
            res = sb.toString();
            i++;
        }
        return res;
    }
}