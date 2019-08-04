// problem link
// https://leetcode.com/problems/unique-email-addresses/

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<>();
        for(String s : emails){
            String[] ss = s.split("@");
            String domain = ss[1];
            String local = ss[0];
            StringBuilder sb = new StringBuilder();
            for(char c : local.toCharArray()){
                if(c == '.') continue;
                else if(c == '+') break;
                else sb.append(c);
            }
            String x = sb.toString() + "@" + domain;
            hs.add(x);
        }
        return hs.size();
    }
}